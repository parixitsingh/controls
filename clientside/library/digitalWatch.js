class DigitalWatch {
	show(container, type){
		this.prepareWatchStructure(type);
		container.appendChild(this.watchContainer);
		setInterval(()=>{this.updateTime()}, 1000);
	}

	updateTime(){
		var date = new Date(),
			hour = date.getHours(),
			minute = date.getMinutes(),
			second = date.getSeconds();
		if(this.hourContainer.value !== hour){
			this.hourContainer.innerHTML = hour < 10 ? "0" + hour : hour;
			this.hourContainer.value = hour;
		}
		if(this.minuteContainer.value !== minute){
			this.minuteContainer.innerHTML = minute < 10 ? "0" + minute : minute;
			this.minuteContainer.value = minute;
		}
		this.secondContainer.innerHTML = second < 10 ? "0" + second : second;
	}

	/* 
	<div class="digital-watch">
		<span="watch-content">
			<span class="dw-hour"></span>
			<span class="hm-seperator"></span>
			<span class="dw-minute"></span>
			<span class="ms-seperator"></span>
			<span class="dw-second"></span>
		</span>
	</div>
	*/
	prepareWatchStructure(type){
		var date = new Date();
		this.watchContainer = this.getTagWithClassAndContent({
			tag : 'div', className : `digital-watch ${type}`
		});
		this.watchContent = this.getTagWithClassAndContent({
			tag : 'span', className : 'watch-content'
		});
		this.hourContainer = this.getTagWithClassAndContent({
			tag : 'span', className : 'dw-hour'
		});
		this.hmSeperator = this.getTagWithClassAndContent({
			tag : 'span', content : ":", className : 'hm-seperator'
		});
		this.minuteContainer = this.getTagWithClassAndContent({
			tag : 'span', className : 'dw-minute'
		});
		this.msSeperator = this.getTagWithClassAndContent({
			tag : 'span', content : ":", className : 'ms-seperator'
		});
		this.secondContainer = this.getTagWithClassAndContent({
			tag : 'span', className : 'dw-second'
		});
		
		this.watchContent.appendChild(this.hourContainer);
		this.watchContent.appendChild(this.hmSeperator);
		this.watchContent.appendChild(this.minuteContainer);
		this.watchContent.appendChild(this.msSeperator);
		this.watchContent.appendChild(this.secondContainer);
		this.watchContainer.appendChild(this.watchContent);
		this.updateTime();
	}

	getTagWithClassAndContent(options){
		let element = document.createElement(options.tag);
		element.className = options.className;
		element.innerHTML = options.content || '';
		return element;
	}
}

var watchCoral = new DigitalWatch(), watchCoralLong = new DigitalWatch();
watchCoral.show(document.getElementsByClassName('main')[0], 'coral-long');
watchCoralLong.show(document.getElementsByClassName('main')[0], 'coral');
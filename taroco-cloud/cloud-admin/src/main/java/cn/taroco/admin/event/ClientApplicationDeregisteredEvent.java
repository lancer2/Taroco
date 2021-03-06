/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.taroco.admin.event;

import cn.taroco.admin.model.Instance;

/**
 * 服务从admin删除
 *
 * @author liuht
 */
public class ClientApplicationDeregisteredEvent extends ClientApplicationEvent {
	private static final long serialVersionUID = 1L;

	public ClientApplicationDeregisteredEvent(String serviceId, Instance instance) {
		super(serviceId, instance, "DEREGISTRATION");
	}
}

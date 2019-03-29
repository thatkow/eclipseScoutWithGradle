package org.eclipse.scout.apps.helloworld.server.helloworld;

import org.eclipse.scout.apps.helloworld.server.ServerSession;
import org.eclipse.scout.apps.helloworld.shared.helloworld.HelloWorldFormData;
import org.eclipse.scout.apps.helloworld.shared.helloworld.IHelloWorldService;

/**
 * <h3>{@link HelloWorldService}</h3>
 *
 * @author andrew
 */
public class HelloWorldService implements IHelloWorldService {

	@Override
	public HelloWorldFormData load(HelloWorldFormData input) {
		StringBuilder msg = new StringBuilder();
		msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
		input.getMessage().setValue(msg.toString());
		return input;
	}
}

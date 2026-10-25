package app.chalo.network.exception;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/network/exception/BaseNetworkException;", "Ljava/io/IOException;", "Lio/ktor/utils/io/errors/IOException;", "InvalidAccessTokenUsedException", "NetworkConnectionFailedException", "TimeoutException", "Lapp/chalo/network/exception/BaseNetworkException$InvalidAccessTokenUsedException;", "Lapp/chalo/network/exception/BaseNetworkException$NetworkConnectionFailedException;", "Lapp/chalo/network/exception/BaseNetworkException$TimeoutException;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseNetworkException extends IOException {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/exception/BaseNetworkException$InvalidAccessTokenUsedException;", "Lapp/chalo/network/exception/BaseNetworkException;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class InvalidAccessTokenUsedException extends BaseNetworkException {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/exception/BaseNetworkException$NetworkConnectionFailedException;", "Lapp/chalo/network/exception/BaseNetworkException;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class NetworkConnectionFailedException extends BaseNetworkException {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/exception/BaseNetworkException$TimeoutException;", "Lapp/chalo/network/exception/BaseNetworkException;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimeoutException extends BaseNetworkException {
    }
}

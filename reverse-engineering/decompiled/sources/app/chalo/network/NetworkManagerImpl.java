package app.chalo.network;

import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import app.chalo.network.mock.ApiSourceAwareRequestDispatcher;
import app.chalo.network.rest.request.GenericRequestData;
import app.chalo.network.rest.request.MultipartRequestData;
import app.chalo.network.rest.request.NetworkRequestBuilder;
import app.chalo.network.rest.request.PriorityLevel;
import com.adjust.sdk.Constants;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/NetworkManagerImpl;", "Lapp/chalo/network/NetworkManager;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NetworkManagerImpl implements NetworkManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloUrlProvider f6453a;
    public final NetworkCrashlyticsLogger b;
    public final ApiSourceAwareRequestDispatcher c;

    public NetworkManagerImpl(ChaloUrlProvider chaloUrlProvider, NetworkCrashlyticsLogger networkCrashlyticsLogger, ApiSourceAwareRequestDispatcher apiSourceAwareRequestDispatcher) {
        this.f6453a = chaloUrlProvider;
        this.b = networkCrashlyticsLogger;
        this.c = apiSourceAwareRequestDispatcher;
    }

    @Override // app.chalo.network.NetworkManager
    public final NetworkRequestBuilder a() {
        NetworkRequestBuilder networkRequestBuilder = new NetworkRequestBuilder(new GenericRequestData(), this.b, this.c);
        networkRequestBuilder.d("https://chalo.com");
        networkRequestBuilder.g(PriorityLevel.PRIORITY_TYPE_NORMAL);
        networkRequestBuilder.k(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        return networkRequestBuilder;
    }

    @Override // app.chalo.network.NetworkManager
    public final NetworkRequestBuilder b() {
        NetworkRequestBuilder networkRequestBuilder = new NetworkRequestBuilder(new MultipartRequestData(), this.b, this.c);
        networkRequestBuilder.d(this.f6453a.g());
        networkRequestBuilder.g(PriorityLevel.PRIORITY_TYPE_NORMAL);
        networkRequestBuilder.k(Constants.CONNECTION_TIMEOUT_VERIFY);
        return networkRequestBuilder;
    }

    @Override // app.chalo.network.NetworkManager
    public final NetworkRequestBuilder c() {
        NetworkRequestBuilder networkRequestBuilder = new NetworkRequestBuilder(new MultipartRequestData(), this.b, this.c);
        networkRequestBuilder.d("https://maps.googleapis.com/maps/api");
        networkRequestBuilder.g(PriorityLevel.PRIORITY_TYPE_NORMAL);
        networkRequestBuilder.k(Constants.CONNECTION_TIMEOUT_VERIFY);
        return networkRequestBuilder;
    }

    @Override // app.chalo.network.NetworkManager
    public final NetworkRequestBuilder d() {
        NetworkRequestBuilder networkRequestBuilder = new NetworkRequestBuilder(new GenericRequestData(), this.b, this.c);
        networkRequestBuilder.d(this.f6453a.g());
        networkRequestBuilder.g(PriorityLevel.PRIORITY_TYPE_NORMAL);
        networkRequestBuilder.k(AccessibilityNodeInfoCompat.EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH);
        return networkRequestBuilder;
    }
}

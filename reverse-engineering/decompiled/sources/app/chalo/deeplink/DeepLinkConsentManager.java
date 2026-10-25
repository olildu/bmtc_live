package app.chalo.deeplink;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/deeplink/DeepLinkConsentManager;", "", "ConsentStatus", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DeepLinkConsentManager {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/deeplink/DeepLinkConsentManager$ConsentStatus;", "", "Granted", "RequestLaunched", "Lapp/chalo/deeplink/DeepLinkConsentManager$ConsentStatus$Granted;", "Lapp/chalo/deeplink/DeepLinkConsentManager$ConsentStatus$RequestLaunched;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ConsentStatus {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkConsentManager$ConsentStatus$Granted;", "Lapp/chalo/deeplink/DeepLinkConsentManager$ConsentStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Granted implements ConsentStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Granted f2444a = new Granted();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Granted);
            }

            public final int hashCode() {
                return 1668680752;
            }

            public final String toString() {
                return "Granted";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DeepLinkConsentManager$ConsentStatus$RequestLaunched;", "Lapp/chalo/deeplink/DeepLinkConsentManager$ConsentStatus;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RequestLaunched implements ConsentStatus {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final RequestLaunched f2445a = new RequestLaunched();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RequestLaunched);
            }

            public final int hashCode() {
                return -1466746954;
            }

            public final String toString() {
                return "RequestLaunched";
            }
        }
    }

    Flow a();

    Object b(ContinuationImpl continuationImpl);
}

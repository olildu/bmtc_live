package app.chalo.core.networkinspector;

import app.chalo.network.logging.NetworkCallInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorIntent;", "", "InitialLoad", "Refresh", "CloseDetails", "OnBackClicked", "OpenDetails", "CopyCurlClicked", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent$CloseDetails;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent$CopyCurlClicked;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent$InitialLoad;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent$OnBackClicked;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent$OpenDetails;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent$Refresh;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface NetworkInspectorIntent {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorIntent$CloseDetails;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CloseDetails implements NetworkInspectorIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CloseDetails f2298a = new CloseDetails();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CloseDetails);
        }

        public final int hashCode() {
            return 1667416641;
        }

        public final String toString() {
            return "CloseDetails";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorIntent$CopyCurlClicked;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CopyCurlClicked implements NetworkInspectorIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NetworkCallInfo f2299a;

        public CopyCurlClicked(NetworkCallInfo call) {
            Intrinsics.i(call, "call");
            this.f2299a = call;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CopyCurlClicked) && Intrinsics.d(this.f2299a, ((CopyCurlClicked) obj).f2299a);
        }

        public final int hashCode() {
            return this.f2299a.hashCode();
        }

        public final String toString() {
            return "CopyCurlClicked(call=" + this.f2299a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorIntent$InitialLoad;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InitialLoad implements NetworkInspectorIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InitialLoad f2300a = new InitialLoad();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InitialLoad);
        }

        public final int hashCode() {
            return 1695715923;
        }

        public final String toString() {
            return "InitialLoad";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorIntent$OnBackClicked;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OnBackClicked implements NetworkInspectorIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OnBackClicked f2301a = new OnBackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OnBackClicked);
        }

        public final int hashCode() {
            return -2078797910;
        }

        public final String toString() {
            return "OnBackClicked";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorIntent$OpenDetails;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class OpenDetails implements NetworkInspectorIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final NetworkCallInfo f2302a;

        public OpenDetails(NetworkCallInfo call) {
            Intrinsics.i(call, "call");
            this.f2302a = call;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenDetails) && Intrinsics.d(this.f2302a, ((OpenDetails) obj).f2302a);
        }

        public final int hashCode() {
            return this.f2302a.hashCode();
        }

        public final String toString() {
            return "OpenDetails(call=" + this.f2302a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/core/networkinspector/NetworkInspectorIntent$Refresh;", "Lapp/chalo/core/networkinspector/NetworkInspectorIntent;", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Refresh implements NetworkInspectorIntent {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Refresh f2303a = new Refresh();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Refresh);
        }

        public final int hashCode() {
            return 1813136228;
        }

        public final String toString() {
            return "Refresh";
        }
    }
}

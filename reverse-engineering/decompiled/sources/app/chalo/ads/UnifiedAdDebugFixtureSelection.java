package app.chalo.ads;

import defpackage.b3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/ads/UnifiedAdDebugFixtureSelection;", "", "Off", "ForceRendered", "ForceFailure", "Lapp/chalo/ads/UnifiedAdDebugFixtureSelection$ForceFailure;", "Lapp/chalo/ads/UnifiedAdDebugFixtureSelection$ForceRendered;", "Lapp/chalo/ads/UnifiedAdDebugFixtureSelection$Off;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface UnifiedAdDebugFixtureSelection {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdDebugFixtureSelection$ForceFailure;", "Lapp/chalo/ads/UnifiedAdDebugFixtureSelection;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ForceFailure implements UnifiedAdDebugFixtureSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f832a;

        public ForceFailure(int i) {
            this.f832a = i;
            UnifiedAdDebugFixtureScenario unifiedAdDebugFixtureScenario = UnifiedAdDebugFixtureScenario.OFF;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForceFailure) && this.f832a == ((ForceFailure) obj).f832a;
        }

        /* JADX INFO: renamed from: hashCode, reason: from getter */
        public final int getF832a() {
            return this.f832a;
        }

        public final String toString() {
            return b3.d(this.f832a, "ForceFailure(errorCode=", ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdDebugFixtureSelection$ForceRendered;", "Lapp/chalo/ads/UnifiedAdDebugFixtureSelection;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ForceRendered implements UnifiedAdDebugFixtureSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UnifiedAdDebugRenderedContent f833a;
        public final UnifiedAdDebugFixtureScenario b;

        public ForceRendered(UnifiedAdDebugRenderedContent content) {
            Intrinsics.i(content, "content");
            this.f833a = content;
            this.b = UnifiedAdDebugFixtureScenario.FORCE_RENDERED;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ForceRendered) && Intrinsics.d(this.f833a, ((ForceRendered) obj).f833a);
        }

        public final int hashCode() {
            return this.f833a.hashCode();
        }

        public final String toString() {
            return "ForceRendered(content=" + this.f833a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/ads/UnifiedAdDebugFixtureSelection$Off;", "Lapp/chalo/ads/UnifiedAdDebugFixtureSelection;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Off implements UnifiedAdDebugFixtureSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Off f834a = new Off();

        static {
            UnifiedAdDebugFixtureScenario unifiedAdDebugFixtureScenario = UnifiedAdDebugFixtureScenario.OFF;
        }
    }
}

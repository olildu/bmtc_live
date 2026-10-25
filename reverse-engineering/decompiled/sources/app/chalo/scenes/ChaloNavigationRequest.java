package app.chalo.scenes;

import app.chalo.scenes.args.SceneArgs;
import defpackage.r1;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/scenes/ChaloNavigationRequest;", "", "Navigate", "GoBack", "BuildStack", "Lapp/chalo/scenes/ChaloNavigationRequest$BuildStack;", "Lapp/chalo/scenes/ChaloNavigationRequest$GoBack;", "Lapp/chalo/scenes/ChaloNavigationRequest$Navigate;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ChaloNavigationRequest {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/scenes/ChaloNavigationRequest$BuildStack;", "Lapp/chalo/scenes/ChaloNavigationRequest;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BuildStack extends ChaloNavigationRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f9214a;

        public BuildStack(List args) {
            Intrinsics.i(args, "args");
            this.f9214a = args;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BuildStack) && Intrinsics.d(this.f9214a, ((BuildStack) obj).f9214a);
        }

        public final int hashCode() {
            return this.f9214a.hashCode();
        }

        public final String toString() {
            return r1.d("BuildStack(args=", ")", this.f9214a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/scenes/ChaloNavigationRequest$GoBack;", "Lapp/chalo/scenes/ChaloNavigationRequest;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GoBack extends ChaloNavigationRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PopUpToConfig f9215a;

        public GoBack(PopUpToConfig popUpToConfig) {
            this.f9215a = popUpToConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GoBack) && Intrinsics.d(this.f9215a, ((GoBack) obj).f9215a);
        }

        public final int hashCode() {
            PopUpToConfig popUpToConfig = this.f9215a;
            if (popUpToConfig == null) {
                return 0;
            }
            return popUpToConfig.hashCode();
        }

        public final String toString() {
            return "GoBack(popUpToConfig=" + this.f9215a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/scenes/ChaloNavigationRequest$Navigate;", "Lapp/chalo/scenes/ChaloNavigationRequest;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Navigate extends ChaloNavigationRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SceneArgs f9216a;
        public final ChaloNavOptions b;
        public final String c;

        public Navigate(SceneArgs args, ChaloNavOptions chaloNavOptions, String str) {
            Intrinsics.i(args, "args");
            this.f9216a = args;
            this.b = chaloNavOptions;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Navigate)) {
                return false;
            }
            Navigate navigate = (Navigate) obj;
            return Intrinsics.d(this.f9216a, navigate.f9216a) && Intrinsics.d(this.b, navigate.b) && Intrinsics.d(this.c, navigate.c);
        }

        public final int hashCode() {
            int iHashCode = this.f9216a.hashCode() * 31;
            ChaloNavOptions chaloNavOptions = this.b;
            int iHashCode2 = (iHashCode + (chaloNavOptions == null ? 0 : chaloNavOptions.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Navigate(args=");
            sb.append(this.f9216a);
            sb.append(", navOptions=");
            sb.append(this.b);
            sb.append(", startDestinationTag=");
            return vo1.p(sb, this.c, ")");
        }

        public /* synthetic */ Navigate(SceneArgs sceneArgs, ChaloNavOptions chaloNavOptions, String str, int i) {
            this(sceneArgs, (i & 2) != 0 ? null : chaloNavOptions, (i & 4) != 0 ? null : str);
        }
    }
}

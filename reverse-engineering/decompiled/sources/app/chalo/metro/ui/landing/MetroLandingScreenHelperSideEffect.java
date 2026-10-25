package app.chalo.metro.ui.landing;

import defpackage.cb0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenHelperSideEffect;", "", "TriggerLoadingDialog", "ShowToastMessage", "Lapp/chalo/metro/ui/landing/MetroLandingScreenHelperSideEffect$ShowToastMessage;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenHelperSideEffect$TriggerLoadingDialog;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class MetroLandingScreenHelperSideEffect {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenHelperSideEffect$ShowToastMessage;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenHelperSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ShowToastMessage extends MetroLandingScreenHelperSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5490a;

        public ShowToastMessage(String message) {
            Intrinsics.i(message, "message");
            this.f5490a = message;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ShowToastMessage) && Intrinsics.d(this.f5490a, ((ShowToastMessage) obj).f5490a);
        }

        public final int hashCode() {
            return this.f5490a.hashCode();
        }

        public final String toString() {
            return vo1.B("ShowToastMessage(message=", this.f5490a, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/metro/ui/landing/MetroLandingScreenHelperSideEffect$TriggerLoadingDialog;", "Lapp/chalo/metro/ui/landing/MetroLandingScreenHelperSideEffect;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TriggerLoadingDialog extends MetroLandingScreenHelperSideEffect {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f5491a;

        public TriggerLoadingDialog(boolean z) {
            this.f5491a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TriggerLoadingDialog) && this.f5491a == ((TriggerLoadingDialog) obj).f5491a;
        }

        public final int hashCode() {
            return this.f5491a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("TriggerLoadingDialog(shouldShowDialog=", ")", this.f5491a);
        }
    }
}

package app.chalo.uistate.error;

import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/uistate/error/StandardErrorScreenUIState;", "", "ErrorWithMsgAndRetry", "NewErrorWithMsgAndRetry", "Lapp/chalo/uistate/error/StandardErrorScreenUIState$ErrorWithMsgAndRetry;", "Lapp/chalo/uistate/error/StandardErrorScreenUIState$NewErrorWithMsgAndRetry;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class StandardErrorScreenUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/error/StandardErrorScreenUIState$NewErrorWithMsgAndRetry;", "Lapp/chalo/uistate/error/StandardErrorScreenUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NewErrorWithMsgAndRetry extends StandardErrorScreenUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f10024a;
        public final TextUIState.ChaloTextUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final ButtonUIState d;
        public final ButtonUIState e;
        public final NewErrorWithMsgAndRetryUISpecs f;

        public NewErrorWithMsgAndRetry(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, int i) {
            buttonUIState2 = (i & 16) != 0 ? null : buttonUIState2;
            NewErrorWithMsgAndRetryUISpecs newErrorWithMsgAndRetryUISpecs = new NewErrorWithMsgAndRetryUISpecs();
            this.f10024a = imageUIState;
            this.b = chaloTextUIState;
            this.c = chaloTextUIState2;
            this.d = buttonUIState;
            this.e = buttonUIState2;
            this.f = newErrorWithMsgAndRetryUISpecs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NewErrorWithMsgAndRetry)) {
                return false;
            }
            NewErrorWithMsgAndRetry newErrorWithMsgAndRetry = (NewErrorWithMsgAndRetry) obj;
            return Intrinsics.d(this.f10024a, newErrorWithMsgAndRetry.f10024a) && Intrinsics.d(this.b, newErrorWithMsgAndRetry.b) && Intrinsics.d(this.c, newErrorWithMsgAndRetry.c) && Intrinsics.d(this.d, newErrorWithMsgAndRetry.d) && Intrinsics.d(this.e, newErrorWithMsgAndRetry.e) && Intrinsics.d(this.f, newErrorWithMsgAndRetry.f);
        }

        public final int hashCode() {
            ImageUIState imageUIState = this.f10024a;
            int iF = r30.f(this.b, (imageUIState == null ? 0 : imageUIState.hashCode()) * 31, 31);
            TextUIState.ChaloTextUIState chaloTextUIState = this.c;
            int iHashCode = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
            ButtonUIState buttonUIState = this.d;
            int iHashCode2 = (iHashCode + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
            ButtonUIState buttonUIState2 = this.e;
            return this.f.hashCode() + ((iHashCode2 + (buttonUIState2 != null ? buttonUIState2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbN = pk0.n("NewErrorWithMsgAndRetry(errorImage=", this.f10024a, ", errorTitle=", this.b, ", errorMsg=");
            sbN.append(this.c);
            sbN.append(", positiveBtn=");
            sbN.append(this.d);
            sbN.append(", negativeBtn=");
            sbN.append(this.e);
            sbN.append(", specs=");
            sbN.append(this.f);
            sbN.append(")");
            return sbN.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/error/StandardErrorScreenUIState$ErrorWithMsgAndRetry;", "Lapp/chalo/uistate/error/StandardErrorScreenUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ErrorWithMsgAndRetry extends StandardErrorScreenUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageUIState f10023a;
        public final TextUIState.ChaloTextUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final ButtonUIState d;
        public final ButtonUIState e;
        public final ErrorWithMsgAndRetryUISpecs f;

        public ErrorWithMsgAndRetry(ImageUIState imageUIState, TextUIState.ChaloTextUIState errorTitle, TextUIState.ChaloTextUIState chaloTextUIState, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, ErrorWithMsgAndRetryUISpecs specs) {
            Intrinsics.i(errorTitle, "errorTitle");
            Intrinsics.i(specs, "specs");
            this.f10023a = imageUIState;
            this.b = errorTitle;
            this.c = chaloTextUIState;
            this.d = buttonUIState;
            this.e = buttonUIState2;
            this.f = specs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorWithMsgAndRetry)) {
                return false;
            }
            ErrorWithMsgAndRetry errorWithMsgAndRetry = (ErrorWithMsgAndRetry) obj;
            return Intrinsics.d(this.f10023a, errorWithMsgAndRetry.f10023a) && Intrinsics.d(this.b, errorWithMsgAndRetry.b) && Intrinsics.d(this.c, errorWithMsgAndRetry.c) && Intrinsics.d(this.d, errorWithMsgAndRetry.d) && Intrinsics.d(this.e, errorWithMsgAndRetry.e) && Intrinsics.d(this.f, errorWithMsgAndRetry.f);
        }

        public final int hashCode() {
            ImageUIState imageUIState = this.f10023a;
            int iF = r30.f(this.b, (imageUIState == null ? 0 : imageUIState.hashCode()) * 31, 31);
            TextUIState.ChaloTextUIState chaloTextUIState = this.c;
            int iHashCode = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
            ButtonUIState buttonUIState = this.d;
            int iHashCode2 = (iHashCode + (buttonUIState == null ? 0 : buttonUIState.hashCode())) * 31;
            ButtonUIState buttonUIState2 = this.e;
            return this.f.hashCode() + ((iHashCode2 + (buttonUIState2 != null ? buttonUIState2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbN = pk0.n("ErrorWithMsgAndRetry(errorImage=", this.f10023a, ", errorTitle=", this.b, ", errorMsg=");
            sbN.append(this.c);
            sbN.append(", positiveBtn=");
            sbN.append(this.d);
            sbN.append(", negativeBtn=");
            sbN.append(this.e);
            sbN.append(", specs=");
            sbN.append(this.f);
            sbN.append(")");
            return sbN.toString();
        }

        public /* synthetic */ ErrorWithMsgAndRetry(ImageUIState imageUIState, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ButtonUIState buttonUIState, ButtonUIState buttonUIState2, ErrorWithMsgAndRetryUISpecs errorWithMsgAndRetryUISpecs, int i) {
            this(imageUIState, chaloTextUIState, (i & 4) != 0 ? null : chaloTextUIState2, buttonUIState, (i & 16) != 0 ? null : buttonUIState2, (i & 32) != 0 ? new ErrorWithMsgAndRetryUISpecs(null, 0.0f, 0.0f, 0.0f, 255) : errorWithMsgAndRetryUISpecs);
        }
    }
}

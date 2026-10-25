package app.chalo.login.ui.otp;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.BorderUISpec;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIndividualBoxUIState;", "", "Text", "BlinkingCursor", "Lapp/chalo/login/ui/otp/LoginOtpEnterIndividualBoxUIState$BlinkingCursor;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIndividualBoxUIState$Text;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class LoginOtpEnterIndividualBoxUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BorderUISpec f5331a;
    public final float b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIndividualBoxUIState$BlinkingCursor;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIndividualBoxUIState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class BlinkingCursor extends LoginOtpEnterIndividualBoxUIState {
        public final float c;
        public final ChaloColorToken d;
        public final ChaloPadding e;
        public final BorderUISpec f;

        public BlinkingCursor(BorderUISpec borderUISpec) {
            float f = ChaloThemeHelper.a().c;
            ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().g, 1);
            super(borderUISpec);
            this.c = f;
            this.d = ChaloColorToken.OrangePrimary.f9835a;
            this.e = chaloPadding;
            this.f = borderUISpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BlinkingCursor)) {
                return false;
            }
            BlinkingCursor blinkingCursor = (BlinkingCursor) obj;
            return Dp.m7283equalsimpl0(this.c, blinkingCursor.c) && Intrinsics.d(this.d, blinkingCursor.d) && Intrinsics.d(this.e, blinkingCursor.e) && Intrinsics.d(this.f, blinkingCursor.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + r30.c(this.e, z40.b(this.d, Dp.m7284hashCodeimpl(this.c) * 31, 31), 31);
        }

        public final String toString() {
            return "BlinkingCursor(width=" + Dp.m7289toStringimpl(this.c) + ", color=" + this.d + ", padding=" + this.e + ", _borderUISpec=" + this.f + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/ui/otp/LoginOtpEnterIndividualBoxUIState$Text;", "Lapp/chalo/login/ui/otp/LoginOtpEnterIndividualBoxUIState;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Text extends LoginOtpEnterIndividualBoxUIState {
        public final TextUIState.ChaloTextUIState c;
        public final BorderUISpec d;

        public Text(TextUIState.ChaloTextUIState chaloTextUIState, BorderUISpec borderUISpec) {
            super(borderUISpec);
            this.c = chaloTextUIState;
            this.d = borderUISpec;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return Intrinsics.d(this.c, text.c) && Intrinsics.d(this.d, text.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + (this.c.hashCode() * 31);
        }

        public final String toString() {
            return "Text(text=" + this.c + ", _borderUISpec=" + this.d + ")";
        }
    }

    public LoginOtpEnterIndividualBoxUIState(BorderUISpec borderUISpec) {
        float f = ChaloThemeHelper.a().o;
        this.f5331a = borderUISpec;
        this.b = f;
    }
}

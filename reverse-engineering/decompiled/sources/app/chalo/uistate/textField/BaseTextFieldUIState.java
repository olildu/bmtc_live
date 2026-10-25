package app.chalo.uistate.textField;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.UITextStyle;
import defpackage.hq0;
import defpackage.i4;
import defpackage.pk0;
import defpackage.uf0;
import defpackage.vo1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/uistate/textField/BaseTextFieldUIState;", "", "TextFieldUIState", "ClickableTextFieldUIState", "Lapp/chalo/uistate/textField/BaseTextFieldUIState$ClickableTextFieldUIState;", "Lapp/chalo/uistate/textField/BaseTextFieldUIState$TextFieldUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseTextFieldUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/textField/BaseTextFieldUIState$ClickableTextFieldUIState;", "Lapp/chalo/uistate/textField/BaseTextFieldUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClickableTextFieldUIState extends BaseTextFieldUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10098a;
        public final UiEventHandler b;
        public final UITextStyle c;
        public final TextFieldLabelPlaceholderUIState d;
        public final TextFieldLabelPlaceholderUIState e;
        public final ImageUIState f;
        public final boolean g;
        public final UIKeyboardOption h;
        public final boolean i;
        public final int j;
        public final int k;
        public final UIShape l;
        public final UITextFieldColors m;
        public final float n;
        public final Lazy o;

        public ClickableTextFieldUIState(String value, UiEventHandler onClick, UITextStyle textStyle, TextFieldLabelPlaceholderUIState.TextLabel textLabel, TextFieldLabelPlaceholderUIState.TextLabel textLabel2, ImageUIState imageUIState, boolean z, UIKeyboardOption uIKeyboardOption, UIShape uIShape, UITextFieldColors uITextFieldColors, float f, int i) {
            UIShape shape;
            TextFieldLabelPlaceholderUIState.TextLabel textLabel3 = (i & 8) != 0 ? null : textLabel;
            TextFieldLabelPlaceholderUIState.TextLabel textLabel4 = (i & 16) != 0 ? null : textLabel2;
            ImageUIState imageUIState2 = (i & 64) != 0 ? null : imageUIState;
            boolean z2 = (i & 128) != 0 ? false : z;
            UIKeyboardOption uIKeyboardOption2 = (i & 256) == 0 ? uIKeyboardOption : null;
            if ((i & 4096) != 0) {
                float f2 = ChaloThemeHelper.a().e;
                shape = new UIShape.Rectangle(f2, f2, f2, f2);
            } else {
                shape = uIShape;
            }
            UITextFieldColors uITextFieldColors2 = (i & 8192) != 0 ? new UITextFieldColors(null, null, null, null, null, null, null, null, null, null, null, null, 4194303) : uITextFieldColors;
            float f3 = (i & 16384) != 0 ? ChaloThemeHelper.a().p : f;
            Intrinsics.i(value, "value");
            Intrinsics.i(onClick, "onClick");
            Intrinsics.i(textStyle, "textStyle");
            Intrinsics.i(shape, "shape");
            this.f10098a = value;
            this.b = onClick;
            this.c = textStyle;
            this.d = textLabel3;
            this.e = textLabel4;
            this.f = imageUIState2;
            this.g = z2;
            this.h = uIKeyboardOption2;
            this.i = true;
            this.j = 1;
            this.k = Integer.MAX_VALUE;
            this.l = shape;
            this.m = uITextFieldColors2;
            this.n = f3;
            this.o = LazyKt.b(new i4(this, 10));
        }

        @Override // app.chalo.uistate.textField.BaseTextFieldUIState
        /* JADX INFO: renamed from: a */
        public final TextFieldEventHandler getB() {
            return (TextFieldEventHandler) this.o.getValue();
        }

        @Override // app.chalo.uistate.textField.BaseTextFieldUIState
        /* JADX INFO: renamed from: b, reason: from getter */
        public final ImageUIState getF() {
            return this.f;
        }

        @Override // app.chalo.uistate.textField.BaseTextFieldUIState
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getH() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickableTextFieldUIState)) {
                return false;
            }
            ClickableTextFieldUIState clickableTextFieldUIState = (ClickableTextFieldUIState) obj;
            return Intrinsics.d(this.f10098a, clickableTextFieldUIState.f10098a) && Intrinsics.d(this.b, clickableTextFieldUIState.b) && this.c == clickableTextFieldUIState.c && Intrinsics.d(this.d, clickableTextFieldUIState.d) && Intrinsics.d(this.e, clickableTextFieldUIState.e) && Intrinsics.d(this.f, clickableTextFieldUIState.f) && this.g == clickableTextFieldUIState.g && Intrinsics.d(this.h, clickableTextFieldUIState.h) && this.i == clickableTextFieldUIState.i && this.j == clickableTextFieldUIState.j && this.k == clickableTextFieldUIState.k && Intrinsics.d(this.l, clickableTextFieldUIState.l) && Intrinsics.d(this.m, clickableTextFieldUIState.m) && Dp.m7283equalsimpl0(this.n, clickableTextFieldUIState.n);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f10098a.hashCode() * 31)) * 31)) * 31;
            TextFieldLabelPlaceholderUIState textFieldLabelPlaceholderUIState = this.d;
            int iHashCode2 = (iHashCode + (textFieldLabelPlaceholderUIState == null ? 0 : textFieldLabelPlaceholderUIState.hashCode())) * 31;
            TextFieldLabelPlaceholderUIState textFieldLabelPlaceholderUIState2 = this.e;
            int iHashCode3 = (iHashCode2 + (textFieldLabelPlaceholderUIState2 == null ? 0 : textFieldLabelPlaceholderUIState2.hashCode())) * 961;
            ImageUIState imageUIState = this.f;
            int iHashCode4 = (((iHashCode3 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31) + (this.g ? 1231 : 1237)) * 31;
            UIKeyboardOption uIKeyboardOption = this.h;
            return uf0.a(this.n, (this.m.hashCode() + pk0.b(this.l, (((((((iHashCode4 + (uIKeyboardOption != null ? uIKeyboardOption.hashCode() : 0)) * 31) + (this.i ? 1231 : 1237)) * 31) + this.j) * 31) + this.k) * 31, 31)) * 31, 31);
        }

        public final String toString() {
            return "ClickableTextFieldUIState(value=" + this.f10098a + ", onClick=" + this.b + ", textStyle=" + this.c + ", label=" + this.d + ", placeholder=" + this.e + ", leadingIcon=null, trailiingIcon=" + this.f + ", isError=" + this.g + ", keyboardOption=" + this.h + ", singleLine=" + this.i + ", maxLines=" + this.j + ", maxLength=" + this.k + ", shape=" + this.l + ", colors=" + this.m + ", height=" + Dp.m7289toStringimpl(this.n) + ", visualTransformation=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/textField/BaseTextFieldUIState$TextFieldUIState;", "Lapp/chalo/uistate/textField/BaseTextFieldUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextFieldUIState extends BaseTextFieldUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f10099a;
        public final TextFieldEventHandler b;
        public final boolean c;
        public final UITextStyle d;
        public final TextFieldLabelPlaceholderUIState e;
        public final TextFieldLabelPlaceholderUIState f;
        public final ImageUIState g;
        public final boolean h;
        public final UIKeyboardOption i;
        public final boolean j;
        public final int k;
        public final int l;
        public final UIShape m;
        public final UITextFieldColors n;
        public final float o;

        public TextFieldUIState(String value, TextFieldEventHandler eventHandler, UITextStyle uITextStyle, TextFieldLabelPlaceholderUIState.TextLabel textLabel, TextFieldLabelPlaceholderUIState.TextLabel textLabel2, ImageUIState imageUIState, boolean z, UIKeyboardOption uIKeyboardOption, int i, UIShape uIShape, UITextFieldColors uITextFieldColors, float f, int i2) {
            UIShape shape;
            UITextStyle textStyle = (i2 & 16) != 0 ? UITextStyle.DisplaySmall : uITextStyle;
            TextFieldLabelPlaceholderUIState.TextLabel textLabel3 = (i2 & 32) != 0 ? null : textLabel;
            TextFieldLabelPlaceholderUIState.TextLabel textLabel4 = (i2 & 64) != 0 ? null : textLabel2;
            ImageUIState imageUIState2 = (i2 & 128) != 0 ? null : imageUIState;
            boolean z2 = (i2 & 512) != 0 ? false : z;
            UIKeyboardOption uIKeyboardOption2 = (i2 & 1024) == 0 ? uIKeyboardOption : null;
            boolean z3 = (i2 & 2048) != 0;
            int i3 = (i2 & 4096) != 0 ? 1 : 4;
            int i4 = (i2 & 8192) != 0 ? Integer.MAX_VALUE : i;
            if ((i2 & 16384) != 0) {
                float f2 = ChaloThemeHelper.a().e;
                shape = new UIShape.Rectangle(f2, f2, f2, f2);
            } else {
                shape = uIShape;
            }
            UITextFieldColors colors = (32768 & i2) != 0 ? new UITextFieldColors(null, null, null, null, null, null, null, null, null, null, null, null, 4194303) : uITextFieldColors;
            float f3 = (i2 & 65536) != 0 ? ChaloThemeHelper.a().p : f;
            Intrinsics.i(value, "value");
            Intrinsics.i(eventHandler, "eventHandler");
            Intrinsics.i(textStyle, "textStyle");
            Intrinsics.i(shape, "shape");
            Intrinsics.i(colors, "colors");
            this.f10099a = value;
            this.b = eventHandler;
            this.c = true;
            this.d = textStyle;
            this.e = textLabel3;
            this.f = textLabel4;
            this.g = imageUIState2;
            this.h = z2;
            this.i = uIKeyboardOption2;
            this.j = z3;
            this.k = i3;
            this.l = i4;
            this.m = shape;
            this.n = colors;
            this.o = f3;
        }

        @Override // app.chalo.uistate.textField.BaseTextFieldUIState
        /* JADX INFO: renamed from: a, reason: from getter */
        public final TextFieldEventHandler getB() {
            return this.b;
        }

        @Override // app.chalo.uistate.textField.BaseTextFieldUIState
        /* JADX INFO: renamed from: b */
        public final ImageUIState getF() {
            return null;
        }

        @Override // app.chalo.uistate.textField.BaseTextFieldUIState
        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getH() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextFieldUIState)) {
                return false;
            }
            TextFieldUIState textFieldUIState = (TextFieldUIState) obj;
            return Intrinsics.d(this.f10099a, textFieldUIState.f10099a) && Intrinsics.d(this.b, textFieldUIState.b) && this.c == textFieldUIState.c && this.d == textFieldUIState.d && Intrinsics.d(this.e, textFieldUIState.e) && Intrinsics.d(this.f, textFieldUIState.f) && Intrinsics.d(this.g, textFieldUIState.g) && this.h == textFieldUIState.h && Intrinsics.d(this.i, textFieldUIState.i) && this.j == textFieldUIState.j && this.k == textFieldUIState.k && this.l == textFieldUIState.l && Intrinsics.d(this.m, textFieldUIState.m) && Intrinsics.d(this.n, textFieldUIState.n) && Dp.m7283equalsimpl0(this.o, textFieldUIState.o);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + ((((((this.b.hashCode() + (this.f10099a.hashCode() * 31)) * 31) + (this.c ? 1231 : 1237)) * 31) + 1237) * 31)) * 31;
            TextFieldLabelPlaceholderUIState textFieldLabelPlaceholderUIState = this.e;
            int iHashCode2 = (iHashCode + (textFieldLabelPlaceholderUIState == null ? 0 : textFieldLabelPlaceholderUIState.hashCode())) * 31;
            TextFieldLabelPlaceholderUIState textFieldLabelPlaceholderUIState2 = this.f;
            int iHashCode3 = (iHashCode2 + (textFieldLabelPlaceholderUIState2 == null ? 0 : textFieldLabelPlaceholderUIState2.hashCode())) * 31;
            ImageUIState imageUIState = this.g;
            int iHashCode4 = (((iHashCode3 + (imageUIState == null ? 0 : imageUIState.hashCode())) * 961) + (this.h ? 1231 : 1237)) * 31;
            UIKeyboardOption uIKeyboardOption = this.i;
            return Dp.m7284hashCodeimpl(this.o) + ((this.n.hashCode() + pk0.b(this.m, (((((((iHashCode4 + (uIKeyboardOption != null ? uIKeyboardOption.hashCode() : 0)) * 31) + (this.j ? 1231 : 1237)) * 31) + this.k) * 31) + this.l) * 31, 31)) * 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.o);
            StringBuilder sb = new StringBuilder("TextFieldUIState(value=");
            sb.append(this.f10099a);
            sb.append(", eventHandler=");
            sb.append(this.b);
            sb.append(", enabled=");
            sb.append(this.c);
            sb.append(", readOnly=false, textStyle=");
            sb.append(this.d);
            sb.append(", label=");
            sb.append(this.e);
            sb.append(", placeholder=");
            sb.append(this.f);
            sb.append(", leadingIcon=");
            sb.append(this.g);
            sb.append(", trailiingIcon=null, isError=");
            sb.append(this.h);
            sb.append(", keyboardOption=");
            sb.append(this.i);
            sb.append(", singleLine=");
            sb.append(this.j);
            sb.append(", maxLines=");
            hq0.p(this.k, this.l, ", maxLength=", ", shape=", sb);
            sb.append(this.m);
            sb.append(", colors=");
            sb.append(this.n);
            sb.append(", height=");
            return vo1.p(sb, strM7289toStringimpl, ")");
        }
    }

    public BaseTextFieldUIState() {
        UITextStyle uITextStyle = UITextStyle.DisplayLarge;
        float f = ChaloThemeHelper.a().e;
        new UITextFieldColors(null, null, null, null, null, null, null, null, null, null, null, null, 4194303);
        ChaloThemeHelper.a().getClass();
    }

    /* JADX INFO: renamed from: a */
    public abstract TextFieldEventHandler getB();

    /* JADX INFO: renamed from: b */
    public ImageUIState getF() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public boolean getH() {
        return false;
    }
}

package app.chalo.uistate.text;

import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import defpackage.r30;
import defpackage.vo1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/uistate/text/TextUIState;", "", "ChaloTextUIState", "StyledTextUIState", "ExpandingTextUIState", "Lapp/chalo/uistate/text/TextUIState$ChaloTextUIState;", "Lapp/chalo/uistate/text/TextUIState$ExpandingTextUIState;", "Lapp/chalo/uistate/text/TextUIState$StyledTextUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TextUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10088a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/TextUIState$ExpandingTextUIState;", "Lapp/chalo/uistate/text/TextUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ExpandingTextUIState extends TextUIState {
        public final ChaloTextUIState b;
        public final int c;
        public final ChaloTextUIState d;
        public final UiEventHandler e;
        public final boolean f;
        public final String g;

        public ExpandingTextUIState(ChaloTextUIState chaloTextUIState, int i, ChaloTextUIState chaloTextUIState2, UiEventHandler uiEventHandler, boolean z, String str) {
            super(str);
            this.b = chaloTextUIState;
            this.c = i;
            this.d = chaloTextUIState2;
            this.e = uiEventHandler;
            this.f = z;
            this.g = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpandingTextUIState)) {
                return false;
            }
            ExpandingTextUIState expandingTextUIState = (ExpandingTextUIState) obj;
            return Intrinsics.d(this.b, expandingTextUIState.b) && this.c == expandingTextUIState.c && Intrinsics.d(this.d, expandingTextUIState.d) && Intrinsics.d(this.e, expandingTextUIState.e) && this.f == expandingTextUIState.f && Intrinsics.d(this.g, expandingTextUIState.g);
        }

        public final int hashCode() {
            int iHashCode = (((this.e.hashCode() + r30.f(this.d, ((this.b.hashCode() * 31) + this.c) * 31, 31)) * 31) + (this.f ? 1231 : 1237)) * 31;
            String str = this.g;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "ExpandingTextUIState(text=" + this.b + ", minimizedMaxLines=" + this.c + ", expandCta=" + this.d + ", eventHandler=" + this.e + ", initialExpandState=" + this.f + ", _plotlineLabel=" + this.g + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/TextUIState$StyledTextUIState;", "Lapp/chalo/uistate/text/TextUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StyledTextUIState extends TextUIState {
        public final List b;
        public final UITextAlign c;
        public final int d;
        public final UITextOverflow e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StyledTextUIState(List data, UITextAlign textAlign, UITextOverflow textOverflow, int i) {
            super(null);
            textAlign = (i & 2) != 0 ? UITextAlign.Left : textAlign;
            int i2 = (i & 4) != 0 ? Integer.MAX_VALUE : 1;
            textOverflow = (i & 8) != 0 ? UITextOverflow.Clip : textOverflow;
            Intrinsics.i(data, "data");
            Intrinsics.i(textAlign, "textAlign");
            Intrinsics.i(textOverflow, "textOverflow");
            this.b = data;
            this.c = textAlign;
            this.d = i2;
            this.e = textOverflow;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StyledTextUIState)) {
                return false;
            }
            StyledTextUIState styledTextUIState = (StyledTextUIState) obj;
            return Intrinsics.d(this.b, styledTextUIState.b) && this.c == styledTextUIState.c && this.d == styledTextUIState.d && this.e == styledTextUIState.e;
        }

        public final int hashCode() {
            return (this.e.hashCode() + ((((this.c.hashCode() + (this.b.hashCode() * 31)) * 31) + this.d) * 31)) * 31;
        }

        public final String toString() {
            return "StyledTextUIState(data=" + this.b + ", textAlign=" + this.c + ", maxLines=" + this.d + ", textOverflow=" + this.e + ", _plotlineLabel=null)";
        }
    }

    public TextUIState(String str) {
        this.f10088a = str;
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/TextUIState$ChaloTextUIState;", "Lapp/chalo/uistate/text/TextUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChaloTextUIState extends TextUIState {
        public final String b;
        public final UITextStyle c;
        public final ChaloColorToken d;
        public final int e;
        public final int f;
        public final UITextAlign g;
        public final UIFontWeight h;
        public final Integer i;
        public final UiEventHandler j;
        public final UITextDecoration k;
        public final UITextOverflow l;
        public final UIFontStyle m;
        public final String n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChaloTextUIState(String string, UITextStyle style, ChaloColorToken chaloColorToken, int i, int i2, UITextAlign uITextAlign, UIFontWeight uIFontWeight, Integer num, UiEventHandler uiEventHandler, UITextDecoration textDecoration, UITextOverflow textOverflow, UIFontStyle uIFontStyle, String str) {
            super(str);
            Intrinsics.i(string, "string");
            Intrinsics.i(style, "style");
            Intrinsics.i(textDecoration, "textDecoration");
            Intrinsics.i(textOverflow, "textOverflow");
            this.b = string;
            this.c = style;
            this.d = chaloColorToken;
            this.e = i;
            this.f = i2;
            this.g = uITextAlign;
            this.h = uIFontWeight;
            this.i = num;
            this.j = uiEventHandler;
            this.k = textDecoration;
            this.l = textOverflow;
            this.m = uIFontStyle;
            this.n = str;
        }

        public static ChaloTextUIState a(ChaloTextUIState chaloTextUIState, UITextStyle uITextStyle, ChaloColorToken chaloColorToken, UITextAlign uITextAlign, int i) {
            String string = chaloTextUIState.b;
            UITextStyle style = (i & 2) != 0 ? chaloTextUIState.c : uITextStyle;
            ChaloColorToken chaloColorToken2 = (i & 4) != 0 ? chaloTextUIState.d : chaloColorToken;
            int i2 = (i & 8) != 0 ? chaloTextUIState.e : 1;
            int i3 = chaloTextUIState.f;
            UITextAlign uITextAlign2 = (i & 32) != 0 ? chaloTextUIState.g : uITextAlign;
            UIFontWeight uIFontWeight = chaloTextUIState.h;
            Integer num = chaloTextUIState.i;
            UiEventHandler uiEventHandler = (i & 256) != 0 ? chaloTextUIState.j : null;
            UITextDecoration textDecoration = chaloTextUIState.k;
            UITextOverflow textOverflow = chaloTextUIState.l;
            UIFontStyle uIFontStyle = chaloTextUIState.m;
            String str = chaloTextUIState.n;
            chaloTextUIState.getClass();
            Intrinsics.i(string, "string");
            Intrinsics.i(style, "style");
            Intrinsics.i(textDecoration, "textDecoration");
            Intrinsics.i(textOverflow, "textOverflow");
            return new ChaloTextUIState(string, style, chaloColorToken2, i2, i3, uITextAlign2, uIFontWeight, num, uiEventHandler, textDecoration, textOverflow, uIFontStyle, str);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getB() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChaloTextUIState)) {
                return false;
            }
            ChaloTextUIState chaloTextUIState = (ChaloTextUIState) obj;
            return Intrinsics.d(this.b, chaloTextUIState.b) && this.c == chaloTextUIState.c && Intrinsics.d(this.d, chaloTextUIState.d) && this.e == chaloTextUIState.e && this.f == chaloTextUIState.f && this.g == chaloTextUIState.g && this.h == chaloTextUIState.h && Intrinsics.d(this.i, chaloTextUIState.i) && Intrinsics.d(this.j, chaloTextUIState.j) && this.k == chaloTextUIState.k && this.l == chaloTextUIState.l && this.m == chaloTextUIState.m && Intrinsics.d(this.n, chaloTextUIState.n);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
            ChaloColorToken chaloColorToken = this.d;
            int iHashCode2 = (((((iHashCode + (chaloColorToken == null ? 0 : chaloColorToken.hashCode())) * 31) + this.e) * 31) + this.f) * 31;
            UITextAlign uITextAlign = this.g;
            int iHashCode3 = (iHashCode2 + (uITextAlign == null ? 0 : uITextAlign.hashCode())) * 31;
            UIFontWeight uIFontWeight = this.h;
            int iHashCode4 = (iHashCode3 + (uIFontWeight == null ? 0 : uIFontWeight.hashCode())) * 31;
            Integer num = this.i;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            UiEventHandler uiEventHandler = this.j;
            int iHashCode6 = (this.l.hashCode() + ((this.k.hashCode() + ((iHashCode5 + (uiEventHandler == null ? 0 : uiEventHandler.hashCode())) * 31)) * 31)) * 31;
            UIFontStyle uIFontStyle = this.m;
            int iHashCode7 = (iHashCode6 + (uIFontStyle == null ? 0 : uIFontStyle.hashCode())) * 31;
            String str = this.n;
            return iHashCode7 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChaloTextUIState(string=");
            sb.append(this.b);
            sb.append(", style=");
            sb.append(this.c);
            sb.append(", chaloColorToken=");
            sb.append(this.d);
            sb.append(", maxLines=");
            sb.append(this.e);
            sb.append(", minLines=");
            sb.append(this.f);
            sb.append(", textAlign=");
            sb.append(this.g);
            sb.append(", fontWeight=");
            sb.append(this.h);
            sb.append(", fontSize=");
            sb.append(this.i);
            sb.append(", eventHandler=");
            sb.append(this.j);
            sb.append(", textDecoration=");
            sb.append(this.k);
            sb.append(", textOverflow=");
            sb.append(this.l);
            sb.append(", fontStyle=");
            sb.append(this.m);
            sb.append(", _plotlineLabel=");
            return vo1.p(sb, this.n, ")");
        }

        public /* synthetic */ ChaloTextUIState(String str, UITextStyle uITextStyle, ChaloColorToken chaloColorToken, int i, UITextAlign uITextAlign, UIFontWeight uIFontWeight, Integer num, UiEventHandler uiEventHandler, UITextDecoration uITextDecoration, UITextOverflow uITextOverflow, UIFontStyle uIFontStyle, String str2, int i2) {
            this(str, (i2 & 2) != 0 ? UITextStyle.HeadlineMedium : uITextStyle, (i2 & 4) != 0 ? null : chaloColorToken, (i2 & 8) != 0 ? Integer.MAX_VALUE : i, 1, (i2 & 32) != 0 ? null : uITextAlign, (i2 & 64) != 0 ? null : uIFontWeight, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : uiEventHandler, (i2 & 512) != 0 ? UITextDecoration.None : uITextDecoration, (i2 & 1024) != 0 ? UITextOverflow.Clip : uITextOverflow, (i2 & 2048) != 0 ? null : uIFontStyle, (i2 & 4096) != 0 ? null : str2);
        }
    }
}

package app.chalo.uistate.text;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/uistate/text/TextWithSpecialFeatureDataUIState;", "", "SimpleText", "SpecialFeature", "Lapp/chalo/uistate/text/TextWithSpecialFeatureDataUIState$SimpleText;", "Lapp/chalo/uistate/text/TextWithSpecialFeatureDataUIState$SpecialFeature;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class TextWithSpecialFeatureDataUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/TextWithSpecialFeatureDataUIState$SimpleText;", "Lapp/chalo/uistate/text/TextWithSpecialFeatureDataUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SimpleText extends TextWithSpecialFeatureDataUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f10092a;

        public SimpleText(TextUIState.ChaloTextUIState chaloTextUIState) {
            this.f10092a = chaloTextUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SimpleText) && Intrinsics.d(this.f10092a, ((SimpleText) obj).f10092a);
        }

        public final int hashCode() {
            return this.f10092a.hashCode();
        }

        public final String toString() {
            return "SimpleText(text=" + this.f10092a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/text/TextWithSpecialFeatureDataUIState$SpecialFeature;", "Lapp/chalo/uistate/text/TextWithSpecialFeatureDataUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SpecialFeature extends TextWithSpecialFeatureDataUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState.ChaloTextUIState f10093a;
        public final ChaloColorToken b;
        public final UIShape c;
        public final ChaloPadding d;

        public SpecialFeature(TextUIState.ChaloTextUIState chaloTextUIState, ChaloColorToken chaloColorToken, UIShape shape, ChaloPadding chaloPadding) {
            Intrinsics.i(shape, "shape");
            this.f10093a = chaloTextUIState;
            this.b = chaloColorToken;
            this.c = shape;
            this.d = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpecialFeature)) {
                return false;
            }
            SpecialFeature specialFeature = (SpecialFeature) obj;
            return Intrinsics.d(this.f10093a, specialFeature.f10093a) && Intrinsics.d(this.b, specialFeature.b) && Intrinsics.d(this.c, specialFeature.c) && Intrinsics.d(this.d, specialFeature.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + pk0.b(this.c, z40.b(this.b, this.f10093a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return "SpecialFeature(text=" + this.f10093a + ", background=" + this.b + ", shape=" + this.c + ", padding=" + this.d + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public SpecialFeature(ChaloColorToken chaloColorToken, TextUIState.ChaloTextUIState chaloTextUIState) {
            UIShape.Rectangle rectangle = UIShape.f1926a;
            float f = ChaloThemeHelper.a().d;
            float f2 = ChaloThemeHelper.a().c;
            this(chaloTextUIState, chaloColorToken, rectangle, new ChaloPadding(f2, f, f, f2));
        }
    }
}

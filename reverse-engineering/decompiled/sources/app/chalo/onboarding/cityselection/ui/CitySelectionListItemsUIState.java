package app.chalo.onboarding.cityselection.ui;

import androidx.compose.ui.unit.Dp;
import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.gf;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.uf0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionListItemsUIState;", "", "CityListItemUIState", "CityListFooterUIState", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionListItemsUIState$CityListFooterUIState;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionListItemsUIState$CityListItemUIState;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CitySelectionListItemsUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionListItemsUIState$CityListFooterUIState;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionListItemsUIState;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CityListFooterUIState extends CitySelectionListItemsUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState f6624a;
        public final ButtonUIState b;
        public final ChaloPadding c;
        public final ChaloPadding d;
        public final ChaloColorToken e;

        public CityListFooterUIState(TextUIState text, ButtonUIState buttonUIState) {
            ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().k, Dp.m7278constructorimpl(ChaloThemeHelper.a().i + ChaloThemeHelper.a().e), Dp.m7278constructorimpl(ChaloThemeHelper.a().i + ChaloThemeHelper.a().e), ChaloThemeHelper.a().x);
            ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 0.0f, 0.0f, 14);
            Intrinsics.i(text, "text");
            this.f6624a = text;
            this.b = buttonUIState;
            this.c = chaloPadding;
            this.d = chaloPadding2;
            this.e = ChaloColorToken.GreyColor.f9806a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CityListFooterUIState)) {
                return false;
            }
            CityListFooterUIState cityListFooterUIState = (CityListFooterUIState) obj;
            return Intrinsics.d(this.f6624a, cityListFooterUIState.f6624a) && Intrinsics.d(this.b, cityListFooterUIState.b) && Intrinsics.d(this.c, cityListFooterUIState.c) && Intrinsics.d(this.d, cityListFooterUIState.d) && Intrinsics.d(this.e, cityListFooterUIState.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + r30.c(this.d, r30.c(this.c, r30.d(this.b, this.f6624a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CityListFooterUIState(text=");
            sb.append(this.f6624a);
            sb.append(", voteBtn=");
            sb.append(this.b);
            sb.append(", internalPadding=");
            r30.o(sb, this.c, ", paddingAroundVoteBtn=", this.d, ", backgroundColor=");
            return pk0.j(sb, this.e, ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionListItemsUIState$CityListItemUIState;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionListItemsUIState;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CityListItemUIState extends CitySelectionListItemsUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextUIState f6625a;
        public final TextUIState b;
        public final ImageUIState c;
        public final UiEventHandler$Companion$fromLambda$1 d;
        public final float e;
        public final ChaloPadding f;
        public final ChaloPadding g;

        public CityListItemUIState(TextUIState cityName, TextUIState textUIState, ImageUIState imageUIState, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1) {
            float f = ChaloThemeHelper.a().p;
            ChaloPadding chaloPadding = new ChaloPadding(0.0f, ChaloThemeHelper.a().h, ChaloThemeHelper.a().f, 0.0f, 9);
            ChaloPadding chaloPadding2 = new ChaloPadding(ChaloThemeHelper.a().h, 0.0f, 2);
            Intrinsics.i(cityName, "cityName");
            this.f6625a = cityName;
            this.b = textUIState;
            this.c = imageUIState;
            this.d = uiEventHandler$Companion$fromLambda$1;
            this.e = f;
            this.f = chaloPadding;
            this.g = chaloPadding2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CityListItemUIState)) {
                return false;
            }
            CityListItemUIState cityListItemUIState = (CityListItemUIState) obj;
            return Intrinsics.d(this.f6625a, cityListItemUIState.f6625a) && Intrinsics.d(this.b, cityListItemUIState.b) && Intrinsics.d(this.c, cityListItemUIState.c) && Intrinsics.d(this.d, cityListItemUIState.d) && Dp.m7283equalsimpl0(this.e, cityListItemUIState.e) && Intrinsics.d(this.f, cityListItemUIState.f) && Intrinsics.d(this.g, cityListItemUIState.g);
        }

        public final int hashCode() {
            int iHashCode = this.f6625a.hashCode() * 31;
            TextUIState textUIState = this.b;
            int iHashCode2 = (iHashCode + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
            ImageUIState imageUIState = this.c;
            return this.g.hashCode() + r30.c(this.f, uf0.a(this.e, gf.a(this.d, (iHashCode2 + (imageUIState != null ? imageUIState.hashCode() : 0)) * 31, 31), 31), 31);
        }

        public final String toString() {
            String strM7289toStringimpl = Dp.m7289toStringimpl(this.e);
            StringBuilder sb = new StringBuilder("CityListItemUIState(cityName=");
            sb.append(this.f6625a);
            sb.append(", cityTag=");
            sb.append(this.b);
            sb.append(", selectionIcon=");
            sb.append(this.c);
            sb.append(", eventHandler=");
            sb.append(this.d);
            sb.append(", height=");
            sb.append(strM7289toStringimpl);
            sb.append(", paddingAroundText=");
            sb.append(this.f);
            sb.append(", paddingAroundIcon=");
            return py.e(sb, this.g, ")");
        }
    }
}

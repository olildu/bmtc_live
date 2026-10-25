package app.chalo.onboarding.cityselection.ui;

import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.textField.BaseTextFieldUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionSearchPanelUIState;", "", "SearchBarCard", "SearchBarTextField", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionSearchPanelUIState$SearchBarCard;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionSearchPanelUIState$SearchBarTextField;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class CitySelectionSearchPanelUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionSearchPanelUIState$SearchBarCard;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionSearchPanelUIState;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchBarCard extends CitySelectionSearchPanelUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CitySelectionSearchPanelUISpec f6632a;
        public final ImageUIState b;
        public final TextUIState.ChaloTextUIState c;
        public final UiEventHandler$Companion$fromLambda$1 d;

        public SearchBarCard(UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, ImageUIState searchIcon, TextUIState.ChaloTextUIState chaloTextUIState) {
            CitySelectionSearchPanelUISpec citySelectionSearchPanelUISpec = new CitySelectionSearchPanelUISpec();
            Intrinsics.i(searchIcon, "searchIcon");
            this.f6632a = citySelectionSearchPanelUISpec;
            this.b = searchIcon;
            this.c = chaloTextUIState;
            this.d = uiEventHandler$Companion$fromLambda$1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchBarCard)) {
                return false;
            }
            SearchBarCard searchBarCard = (SearchBarCard) obj;
            return Intrinsics.d(this.f6632a, searchBarCard.f6632a) && Intrinsics.d(this.b, searchBarCard.b) && Intrinsics.d(this.c, searchBarCard.c) && Intrinsics.d(this.d, searchBarCard.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + r30.f(this.c, r30.e(this.b, this.f6632a.hashCode() * 31, 31), 31);
        }

        public final String toString() {
            return "SearchBarCard(specs=" + this.f6632a + ", searchIcon=" + this.b + ", searchText=" + this.c + ", eventHandler=" + this.d + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/onboarding/cityselection/ui/CitySelectionSearchPanelUIState$SearchBarTextField;", "Lapp/chalo/onboarding/cityselection/ui/CitySelectionSearchPanelUIState;", "onboarding_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchBarTextField extends CitySelectionSearchPanelUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CitySelectionSearchPanelUISpec f6633a = new CitySelectionSearchPanelUISpec();
        public final BaseTextFieldUIState.TextFieldUIState b;

        public SearchBarTextField(BaseTextFieldUIState.TextFieldUIState textFieldUIState) {
            this.b = textFieldUIState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchBarTextField)) {
                return false;
            }
            SearchBarTextField searchBarTextField = (SearchBarTextField) obj;
            return Intrinsics.d(this.f6633a, searchBarTextField.f6633a) && Intrinsics.d(this.b, searchBarTextField.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f6633a.hashCode() * 31);
        }

        public final String toString() {
            return "SearchBarTextField(specs=" + this.f6633a + ", textField=" + this.b + ")";
        }
    }
}

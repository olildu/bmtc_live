package app.chalo.uistate.components;

import androidx.compose.ui.unit.Dp;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/uistate/components/ValidationProductInfoUIState;", "", "TitleAndInfoUIState", "ValidationUserDetailsUIState", "ValidationRouteDetailsUIState", "Lapp/chalo/uistate/components/ValidationProductInfoUIState$TitleAndInfoUIState;", "Lapp/chalo/uistate/components/ValidationProductInfoUIState$ValidationRouteDetailsUIState;", "Lapp/chalo/uistate/components/ValidationProductInfoUIState$ValidationUserDetailsUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface ValidationProductInfoUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/ValidationProductInfoUIState$TitleAndInfoUIState;", "Lapp/chalo/uistate/components/ValidationProductInfoUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TitleAndInfoUIState implements ValidationProductInfoUIState {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TitleAndInfoUIState) && Dp.m7283equalsimpl0(0.0f, 0.0f);
        }

        public final int hashCode() {
            Object obj = null;
            obj.getClass();
            throw null;
        }

        public final String toString() {
            return vo1.B("TitleAndInfoUIState(title=null, info=null, paddingAround=null, spaceBetween=", Dp.m7289toStringimpl(0.0f), ")");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/ValidationProductInfoUIState$ValidationRouteDetailsUIState;", "Lapp/chalo/uistate/components/ValidationProductInfoUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidationRouteDetailsUIState implements ValidationProductInfoUIState {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ValidationRouteDetailsUIState);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "ValidationRouteDetailsUIState(specs=null, icon=null, title=null, routeNameWithSpecialFeatures=null, fromStopName=null, toStopName=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/components/ValidationProductInfoUIState$ValidationUserDetailsUIState;", "Lapp/chalo/uistate/components/ValidationProductInfoUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ValidationUserDetailsUIState implements ValidationProductInfoUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ValidationUserDetailsUISpecs f9958a;
        public final ImageUrlUIState b;
        public final TextUIState c;
        public final TextUIState d;
        public final TextUIState e;
        public final TextUIState f;

        public ValidationUserDetailsUIState(ImageUrlUIState imageUrlUIState, TextUIState.ChaloTextUIState passengerTitle, TextUIState.ChaloTextUIState name, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2) {
            ValidationUserDetailsUISpecs validationUserDetailsUISpecs = new ValidationUserDetailsUISpecs();
            Intrinsics.i(passengerTitle, "passengerTitle");
            Intrinsics.i(name, "name");
            this.f9958a = validationUserDetailsUISpecs;
            this.b = imageUrlUIState;
            this.c = passengerTitle;
            this.d = name;
            this.e = chaloTextUIState;
            this.f = chaloTextUIState2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ValidationUserDetailsUIState)) {
                return false;
            }
            ValidationUserDetailsUIState validationUserDetailsUIState = (ValidationUserDetailsUIState) obj;
            return Intrinsics.d(this.f9958a, validationUserDetailsUIState.f9958a) && Intrinsics.d(this.b, validationUserDetailsUIState.b) && Intrinsics.d(this.c, validationUserDetailsUIState.c) && Intrinsics.d(this.d, validationUserDetailsUIState.d) && Intrinsics.d(this.e, validationUserDetailsUIState.e) && Intrinsics.d(this.f, validationUserDetailsUIState.f);
        }

        public final int hashCode() {
            int iHashCode = this.f9958a.hashCode() * 31;
            ImageUrlUIState imageUrlUIState = this.b;
            int iC = pk0.c(this.d, pk0.c(this.c, (iHashCode + (imageUrlUIState == null ? 0 : imageUrlUIState.hashCode())) * 31, 31), 31);
            TextUIState textUIState = this.e;
            int iHashCode2 = (iC + (textUIState == null ? 0 : textUIState.hashCode())) * 31;
            TextUIState textUIState2 = this.f;
            return iHashCode2 + (textUIState2 != null ? textUIState2.hashCode() : 0);
        }

        public final String toString() {
            return "ValidationUserDetailsUIState(specs=" + this.f9958a + ", profileImage=" + this.b + ", passengerTitle=" + this.c + ", name=" + this.d + ", dob=" + this.e + ", gender=" + this.f + ")";
        }
    }
}

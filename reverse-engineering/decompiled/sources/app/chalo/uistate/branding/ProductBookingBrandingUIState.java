package app.chalo.uistate.branding;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.py;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/uistate/branding/ProductBookingBrandingUIState;", "", "ImageResourceBrandingUIState", "AgencyBrandingUIState", "Lapp/chalo/uistate/branding/ProductBookingBrandingUIState$AgencyBrandingUIState;", "Lapp/chalo/uistate/branding/ProductBookingBrandingUIState$ImageResourceBrandingUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ProductBookingBrandingUIState {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/branding/ProductBookingBrandingUIState$AgencyBrandingUIState;", "Lapp/chalo/uistate/branding/ProductBookingBrandingUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AgencyBrandingUIState extends ProductBookingBrandingUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AgencyBrandingImageUISpecs f9915a;
        public final ImageUrlUIState b;
        public final AgencyBrandingTextUISpecs c;
        public final TextUIState.ChaloTextUIState d;
        public final ChaloPadding e;

        public AgencyBrandingUIState(AgencyBrandingImageUISpecs imageUISpecs, ImageUrlUIState imageUIState, AgencyBrandingTextUISpecs agencyBrandingTextUISpecs, TextUIState.ChaloTextUIState chaloTextUIState) {
            ChaloPadding chaloPadding = new ChaloPadding(0.0f, 0.0f, 3);
            Intrinsics.i(imageUISpecs, "imageUISpecs");
            Intrinsics.i(imageUIState, "imageUIState");
            super(chaloPadding);
            this.f9915a = imageUISpecs;
            this.b = imageUIState;
            this.c = agencyBrandingTextUISpecs;
            this.d = chaloTextUIState;
            this.e = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AgencyBrandingUIState)) {
                return false;
            }
            AgencyBrandingUIState agencyBrandingUIState = (AgencyBrandingUIState) obj;
            return Intrinsics.d(this.f9915a, agencyBrandingUIState.f9915a) && Intrinsics.d(this.b, agencyBrandingUIState.b) && Intrinsics.d(this.c, agencyBrandingUIState.c) && Intrinsics.d(this.d, agencyBrandingUIState.d) && Intrinsics.d(this.e, agencyBrandingUIState.e);
        }

        public final int hashCode() {
            int iC = r30.c(this.c.f9913a, (this.b.hashCode() + (this.f9915a.hashCode() * 31)) * 31, 31);
            TextUIState.ChaloTextUIState chaloTextUIState = this.d;
            return this.e.hashCode() + ((iC + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AgencyBrandingUIState(imageUISpecs=");
            sb.append(this.f9915a);
            sb.append(", imageUIState=");
            sb.append(this.b);
            sb.append(", textUISpecs=");
            sb.append(this.c);
            sb.append(", textUIState=");
            sb.append(this.d);
            sb.append(", contentPadding=");
            return py.e(sb, this.e, ")");
        }
    }

    public ProductBookingBrandingUIState(ChaloPadding chaloPadding) {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/branding/ProductBookingBrandingUIState$ImageResourceBrandingUIState;", "Lapp/chalo/uistate/branding/ProductBookingBrandingUIState;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageResourceBrandingUIState extends ProductBookingBrandingUIState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageResourceBrandingUISpecs f9916a;
        public final ImageUIState b;
        public final ChaloPadding c;

        public ImageResourceBrandingUIState(ImageResourceBrandingUISpecs imageResourceBrandingUISpecs, ImageUIState imageUIState, ChaloPadding chaloPadding) {
            super(chaloPadding);
            this.f9916a = imageResourceBrandingUISpecs;
            this.b = imageUIState;
            this.c = chaloPadding;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageResourceBrandingUIState)) {
                return false;
            }
            ImageResourceBrandingUIState imageResourceBrandingUIState = (ImageResourceBrandingUIState) obj;
            return Intrinsics.d(this.f9916a, imageResourceBrandingUIState.f9916a) && Intrinsics.d(this.b, imageResourceBrandingUIState.b) && Intrinsics.d(this.c, imageResourceBrandingUIState.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + r30.e(this.b, this.f9916a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ImageResourceBrandingUIState(imageUISpecs=");
            sb.append(this.f9916a);
            sb.append(", imageUIState=");
            sb.append(this.b);
            sb.append(", contentPadding=");
            return py.e(sb, this.c, ")");
        }

        public /* synthetic */ ImageResourceBrandingUIState(ImageResourceBrandingUISpecs imageResourceBrandingUISpecs, ImageUIState imageUIState) {
            this(imageResourceBrandingUISpecs, imageUIState, new ChaloPadding(0.0f, 0.0f, 3));
        }
    }
}

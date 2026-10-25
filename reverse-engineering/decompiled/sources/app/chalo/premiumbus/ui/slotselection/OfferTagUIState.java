package app.chalo.premiumbus.ui.slotselection;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.text.TextUIState;
import defpackage.r30;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/ui/slotselection/OfferTagUIState;", "", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class OfferTagUIState {
    public static final /* synthetic */ int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OfferTagUISpecs f7818a;
    public final TextUIState.ChaloTextUIState b;
    public final ImageUIState c;
    public final ChaloPadding d;

    static {
        UIShape.Rectangle rectangle = UIShape.f1926a;
    }

    public OfferTagUIState(TextUIState.ChaloTextUIState chaloTextUIState, ImageUIState imageUIState, int i) {
        OfferTagUISpecs offerTagUISpecs = new OfferTagUISpecs();
        imageUIState = (i & 4) != 0 ? new ImageUIState(IconType.IC_OFFER_GREEN, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().h), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246) : imageUIState;
        ChaloPadding chaloPadding = new ChaloPadding(ChaloThemeHelper.a().d, ChaloThemeHelper.a().e, ChaloThemeHelper.a().f, ChaloThemeHelper.a().d);
        this.f7818a = offerTagUISpecs;
        this.b = chaloTextUIState;
        this.c = imageUIState;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferTagUIState)) {
            return false;
        }
        OfferTagUIState offerTagUIState = (OfferTagUIState) obj;
        return Intrinsics.d(this.f7818a, offerTagUIState.f7818a) && Intrinsics.d(this.b, offerTagUIState.b) && Intrinsics.d(this.c, offerTagUIState.c) && Intrinsics.d(this.d, offerTagUIState.d);
    }

    public final int hashCode() {
        int iF = r30.f(this.b, this.f7818a.hashCode() * 31, 31);
        ImageUIState imageUIState = this.c;
        return this.d.hashCode() + ((iF + (imageUIState == null ? 0 : imageUIState.hashCode())) * 31);
    }

    public final String toString() {
        return "OfferTagUIState(specs=" + this.f7818a + ", text=" + this.b + ", image=" + this.c + ", contentPadding=" + this.d + ")";
    }
}

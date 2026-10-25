package app.chalo.productsummary.ui.data;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.base.UiEventHandler$Companion$fromLambda$1;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.py;
import defpackage.r30;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productsummary/ui/data/ProductSummaryStatusUiData;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductSummaryStatusUiData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageUIState f8756a;
    public final ChaloColorToken b;
    public final UIShape c;
    public final TextUIState.ChaloTextUIState d;
    public final TextUIState.ChaloTextUIState e;
    public final TextUIState.ChaloTextUIState f;
    public final ImageUIState g;
    public final UiEventHandler h;
    public final ChaloPadding i;

    public ProductSummaryStatusUiData(ImageUIState imageUIState, ChaloColorToken bgColor, TextUIState.ChaloTextUIState infoText, TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, ImageUIState imageUIState2, UiEventHandler$Companion$fromLambda$1 uiEventHandler$Companion$fromLambda$1, int i) {
        UIShape.Rectangle bgShape = UIShape.e;
        chaloTextUIState = (i & 16) != 0 ? null : chaloTextUIState;
        chaloTextUIState2 = (i & 32) != 0 ? null : chaloTextUIState2;
        imageUIState2 = (i & 64) != 0 ? null : imageUIState2;
        UiEventHandler uiEventHandler = (i & 128) != 0 ? UiEventHandler.Companion.f9897a : uiEventHandler$Companion$fromLambda$1;
        float f = ChaloThemeHelper.a().f;
        ChaloPadding chaloPadding = new ChaloPadding(f, f, f, f);
        Intrinsics.i(bgColor, "bgColor");
        Intrinsics.i(bgShape, "bgShape");
        Intrinsics.i(infoText, "infoText");
        this.f8756a = imageUIState;
        this.b = bgColor;
        this.c = bgShape;
        this.d = infoText;
        this.e = chaloTextUIState;
        this.f = chaloTextUIState2;
        this.g = imageUIState2;
        this.h = uiEventHandler;
        this.i = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSummaryStatusUiData)) {
            return false;
        }
        ProductSummaryStatusUiData productSummaryStatusUiData = (ProductSummaryStatusUiData) obj;
        return Intrinsics.d(this.f8756a, productSummaryStatusUiData.f8756a) && Intrinsics.d(this.b, productSummaryStatusUiData.b) && Intrinsics.d(this.c, productSummaryStatusUiData.c) && Intrinsics.d(this.d, productSummaryStatusUiData.d) && Intrinsics.d(this.e, productSummaryStatusUiData.e) && Intrinsics.d(this.f, productSummaryStatusUiData.f) && Intrinsics.d(this.g, productSummaryStatusUiData.g) && Intrinsics.d(this.h, productSummaryStatusUiData.h) && Intrinsics.d(this.i, productSummaryStatusUiData.i);
    }

    public final int hashCode() {
        ImageUIState imageUIState = this.f8756a;
        int iF = r30.f(this.d, pk0.b(this.c, z40.b(this.b, (imageUIState == null ? 0 : imageUIState.hashCode()) * 31, 31), 31), 31);
        TextUIState.ChaloTextUIState chaloTextUIState = this.e;
        int iHashCode = (iF + (chaloTextUIState == null ? 0 : chaloTextUIState.hashCode())) * 31;
        TextUIState.ChaloTextUIState chaloTextUIState2 = this.f;
        int iHashCode2 = (iHashCode + (chaloTextUIState2 == null ? 0 : chaloTextUIState2.hashCode())) * 31;
        ImageUIState imageUIState2 = this.g;
        return this.i.hashCode() + ((this.h.hashCode() + ((iHashCode2 + (imageUIState2 != null ? imageUIState2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductSummaryStatusUiData(iconType=");
        sb.append(this.f8756a);
        sb.append(", bgColor=");
        sb.append(this.b);
        sb.append(", bgShape=");
        sb.append(this.c);
        sb.append(", infoText=");
        sb.append(this.d);
        sb.append(", infoMsg=");
        r30.p(sb, this.e, ", ctaText=", this.f, ", ctaIcon=");
        sb.append(this.g);
        sb.append(", ctaEventHandler=");
        sb.append(this.h);
        sb.append(", productBannerContentPadding=");
        return py.e(sb, this.i, ")");
    }
}

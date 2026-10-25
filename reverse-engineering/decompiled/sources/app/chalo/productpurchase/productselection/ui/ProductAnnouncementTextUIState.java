package app.chalo.productpurchase.productselection.ui;

import app.chalo.compose.theme.ChaloPadding;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.compose.theme.UIShape;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.text.TextUIState;
import defpackage.pk0;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductAnnouncementTextUIState;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ProductAnnouncementTextUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState.ChaloTextUIState f8666a;
    public final UIShape b;
    public final ChaloColorToken c;
    public final ChaloPadding d;

    public ProductAnnouncementTextUIState(TextUIState.ChaloTextUIState chaloTextUIState) {
        float f = ChaloThemeHelper.a().d;
        UIShape.Rectangle rectangle = new UIShape.Rectangle(f, f, f, f);
        float f2 = ChaloThemeHelper.a().g;
        float f3 = ChaloThemeHelper.a().h;
        ChaloPadding chaloPadding = new ChaloPadding(f3, f2, f2, f3);
        this.f8666a = chaloTextUIState;
        this.b = rectangle;
        this.c = ChaloColorToken.OrangeBackground.f9832a;
        this.d = chaloPadding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductAnnouncementTextUIState)) {
            return false;
        }
        ProductAnnouncementTextUIState productAnnouncementTextUIState = (ProductAnnouncementTextUIState) obj;
        return Intrinsics.d(this.f8666a, productAnnouncementTextUIState.f8666a) && Intrinsics.d(this.b, productAnnouncementTextUIState.b) && Intrinsics.d(this.c, productAnnouncementTextUIState.c) && Intrinsics.d(this.d, productAnnouncementTextUIState.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + z40.b(this.c, pk0.b(this.b, this.f8666a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ProductAnnouncementTextUIState(text=" + this.f8666a + ", shape=" + this.b + ", backgroundColor=" + this.c + ", paddingAround=" + this.d + ")";
    }
}

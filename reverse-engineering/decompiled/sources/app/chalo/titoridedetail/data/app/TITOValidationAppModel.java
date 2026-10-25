package app.chalo.titoridedetail.data.app;

import app.chalo.models.validation.ValidationProduct;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TITOValidationAppModel;", "", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class TITOValidationAppModel {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TapInDetailAppModel f9672a;
    public final TapOutDetailAppModel b;
    public final TITOProductDetailAppModel c;
    public final TitoValidationStatus d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TITOValidationAppModel$Companion;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        ValidationProduct.Companion companion = ValidationProduct.INSTANCE;
    }

    public TITOValidationAppModel(TapInDetailAppModel tapInDetails, TapOutDetailAppModel tapOutDetailAppModel, TITOProductDetailAppModel productDetails, TitoValidationStatus titoStatus, String str) {
        Intrinsics.i(tapInDetails, "tapInDetails");
        Intrinsics.i(productDetails, "productDetails");
        Intrinsics.i(titoStatus, "titoStatus");
        this.f9672a = tapInDetails;
        this.b = tapOutDetailAppModel;
        this.c = productDetails;
        this.d = titoStatus;
        this.e = str;
    }

    public static TITOValidationAppModel a(TITOValidationAppModel tITOValidationAppModel, TapInDetailAppModel tapInDetailAppModel, TapOutDetailAppModel tapOutDetailAppModel, TitoValidationStatus titoValidationStatus, int i) {
        if ((i & 1) != 0) {
            tapInDetailAppModel = tITOValidationAppModel.f9672a;
        }
        TapInDetailAppModel tapInDetails = tapInDetailAppModel;
        if ((i & 2) != 0) {
            tapOutDetailAppModel = tITOValidationAppModel.b;
        }
        TapOutDetailAppModel tapOutDetailAppModel2 = tapOutDetailAppModel;
        TITOProductDetailAppModel productDetails = tITOValidationAppModel.c;
        if ((i & 8) != 0) {
            titoValidationStatus = tITOValidationAppModel.d;
        }
        TitoValidationStatus titoStatus = titoValidationStatus;
        String str = tITOValidationAppModel.e;
        tITOValidationAppModel.getClass();
        Intrinsics.i(tapInDetails, "tapInDetails");
        Intrinsics.i(productDetails, "productDetails");
        Intrinsics.i(titoStatus, "titoStatus");
        return new TITOValidationAppModel(tapInDetails, tapOutDetailAppModel2, productDetails, titoStatus, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TITOValidationAppModel)) {
            return false;
        }
        TITOValidationAppModel tITOValidationAppModel = (TITOValidationAppModel) obj;
        return Intrinsics.d(this.f9672a, tITOValidationAppModel.f9672a) && Intrinsics.d(this.b, tITOValidationAppModel.b) && Intrinsics.d(this.c, tITOValidationAppModel.c) && this.d == tITOValidationAppModel.d && Intrinsics.d(this.e, tITOValidationAppModel.e);
    }

    public final int hashCode() {
        int iHashCode = this.f9672a.hashCode() * 31;
        TapOutDetailAppModel tapOutDetailAppModel = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (tapOutDetailAppModel == null ? 0 : tapOutDetailAppModel.hashCode())) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TITOValidationAppModel(tapInDetails=");
        sb.append(this.f9672a);
        sb.append(", tapOutDetails=");
        sb.append(this.b);
        sb.append(", productDetails=");
        sb.append(this.c);
        sb.append(", titoStatus=");
        sb.append(this.d);
        sb.append(", userId=");
        return vo1.p(sb, this.e, ")");
    }
}

package app.chalo.homescreen.data.model.app;

import app.chalo.providers.ChaloCtaDisplayType;
import app.chalo.providers.iconassetprovider.IconType;
import defpackage.dd;
import defpackage.nf1;
import defpackage.ox0;
import defpackage.r30;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ProductPurchaseSectionAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ProductPurchaseSectionAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3778a;
    public final String b;
    public final String c;
    public final ChaloCtaDisplayType d;
    public final List e;
    public final IconType f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/ProductPurchaseSectionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/ProductPurchaseSectionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ProductPurchaseSectionAppModel> serializer() {
            return ProductPurchaseSectionAppModel$$serializer.f3779a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new ox0(13)), LazyKt.a(lazyThreadSafetyMode, new ox0(14)), LazyKt.a(lazyThreadSafetyMode, new ox0(15))};
    }

    public /* synthetic */ ProductPurchaseSectionAppModel(int i, String str, String str2, String str3, ChaloCtaDisplayType chaloCtaDisplayType, List list, IconType iconType) {
        if (29 != (i & 29)) {
            PluginExceptionsKt.b(ProductPurchaseSectionAppModel$$serializer.f3779a.getDescriptor(), i, 29);
            throw null;
        }
        this.f3778a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = str3;
        this.d = chaloCtaDisplayType;
        this.e = list;
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = iconType;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPurchaseSectionAppModel)) {
            return false;
        }
        ProductPurchaseSectionAppModel productPurchaseSectionAppModel = (ProductPurchaseSectionAppModel) obj;
        return Intrinsics.d(this.f3778a, productPurchaseSectionAppModel.f3778a) && Intrinsics.d(this.b, productPurchaseSectionAppModel.b) && Intrinsics.d(this.c, productPurchaseSectionAppModel.c) && this.d == productPurchaseSectionAppModel.d && Intrinsics.d(this.e, productPurchaseSectionAppModel.e) && this.f == productPurchaseSectionAppModel.f;
    }

    public final int hashCode() {
        int iHashCode = this.f3778a.hashCode() * 31;
        String str = this.b;
        int iB = r30.b((this.d.hashCode() + nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31, 31, this.e);
        IconType iconType = this.f;
        return iB + (iconType != null ? iconType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ProductPurchaseSectionAppModel(sectionTitle=", this.f3778a, ", sectionDesc=", this.b, ", sectionCta=");
        sbE.append(this.c);
        sbE.append(", sectionCtaDisplayType=");
        sbE.append(this.d);
        sbE.append(", productCardDataList=");
        sbE.append(this.e);
        sbE.append(", icon=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public ProductPurchaseSectionAppModel(String str, String str2, String str3, ChaloCtaDisplayType sectionCtaDisplayType, List productCardDataList, IconType iconType) {
        Intrinsics.i(sectionCtaDisplayType, "sectionCtaDisplayType");
        Intrinsics.i(productCardDataList, "productCardDataList");
        this.f3778a = str;
        this.b = str2;
        this.c = str3;
        this.d = sectionCtaDisplayType;
        this.e = productCardDataList;
        this.f = iconType;
    }
}

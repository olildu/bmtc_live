package app.chalo.homescreen.data.model.app;

import app.chalo.providers.iconassetprovider.IconType;
import defpackage.dd;
import defpackage.nf1;
import defpackage.to0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/PassCardDataAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassCardDataAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new to0(16))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3772a;
    public final String b;
    public final int c;
    public final ItemTextDataAppModel d;
    public final String e;
    public final IconType f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/PassCardDataAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/PassCardDataAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassCardDataAppModel> serializer() {
            return PassCardDataAppModel$$serializer.f3773a;
        }
    }

    public /* synthetic */ PassCardDataAppModel(int i, String str, String str2, int i2, ItemTextDataAppModel itemTextDataAppModel, String str3, IconType iconType) {
        if (28 != (i & 28)) {
            PluginExceptionsKt.b(PassCardDataAppModel$$serializer.f3773a.getDescriptor(), i, 28);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f3772a = null;
        } else {
            this.f3772a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        this.c = i2;
        this.d = itemTextDataAppModel;
        this.e = str3;
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
        if (!(obj instanceof PassCardDataAppModel)) {
            return false;
        }
        PassCardDataAppModel passCardDataAppModel = (PassCardDataAppModel) obj;
        return Intrinsics.d(this.f3772a, passCardDataAppModel.f3772a) && Intrinsics.d(this.b, passCardDataAppModel.b) && this.c == passCardDataAppModel.c && Intrinsics.d(this.d, passCardDataAppModel.d) && Intrinsics.d(this.e, passCardDataAppModel.e) && this.f == passCardDataAppModel.f;
    }

    public final int hashCode() {
        String str = this.f3772a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iE = nf1.e((this.d.hashCode() + ((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.c) * 31)) * 31, 31, this.e);
        IconType iconType = this.f;
        return iE + (iconType != null ? iconType.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("PassCardDataAppModel(itemBgColor=", this.f3772a, ", itemImageUrl=", this.b, ", itemPosition=");
        sbE.append(this.c);
        sbE.append(", itemTextData=");
        sbE.append(this.d);
        sbE.append(", productConfigId=");
        sbE.append(this.e);
        sbE.append(", itemFallbackImage=");
        sbE.append(this.f);
        sbE.append(")");
        return sbE.toString();
    }

    public PassCardDataAppModel(String str, String str2, int i, ItemTextDataAppModel itemTextDataAppModel, String productConfigId, IconType iconType) {
        Intrinsics.i(productConfigId, "productConfigId");
        this.f3772a = str;
        this.b = str2;
        this.c = i;
        this.d = itemTextDataAppModel;
        this.e = productConfigId;
        this.f = iconType;
    }
}

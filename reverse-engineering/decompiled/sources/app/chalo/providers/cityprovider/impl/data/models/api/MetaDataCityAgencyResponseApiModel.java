package app.chalo.providers.cityprovider.impl.data.models.api;

import defpackage.n21;
import defpackage.xs;
import defpackage.z40;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataCityAgencyResponseApiModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MetaDataCityAgencyResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8838a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataCityAgencyResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/providers/cityprovider/impl/data/models/api/MetaDataCityAgencyResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<MetaDataCityAgencyResponseApiModel> serializer() {
            return MetaDataCityAgencyResponseApiModel$$serializer.f8839a;
        }
    }

    public /* synthetic */ MetaDataCityAgencyResponseApiModel(int i, String str, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        if (1 != (i & 1)) {
            PluginExceptionsKt.b(MetaDataCityAgencyResponseApiModel$$serializer.f8839a.getDescriptor(), i, 1);
            throw null;
        }
        this.f8838a = str;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = false;
        } else {
            this.c = z;
        }
        if ((i & 8) == 0) {
            this.d = false;
        } else {
            this.d = z2;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z3;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z4;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z5;
        }
        if ((i & 128) == 0) {
            this.h = false;
        } else {
            this.h = z6;
        }
        if ((i & 256) == 0) {
            this.i = false;
        } else {
            this.i = z7;
        }
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z8;
        }
        if ((i & 1024) == 0) {
            this.k = false;
        } else {
            this.k = z9;
        }
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z10;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MetaDataCityAgencyResponseApiModel)) {
            return false;
        }
        MetaDataCityAgencyResponseApiModel metaDataCityAgencyResponseApiModel = (MetaDataCityAgencyResponseApiModel) obj;
        return Intrinsics.d(this.f8838a, metaDataCityAgencyResponseApiModel.f8838a) && this.b == metaDataCityAgencyResponseApiModel.b && this.c == metaDataCityAgencyResponseApiModel.c && this.d == metaDataCityAgencyResponseApiModel.d && this.e == metaDataCityAgencyResponseApiModel.e && this.f == metaDataCityAgencyResponseApiModel.f && this.g == metaDataCityAgencyResponseApiModel.g && this.h == metaDataCityAgencyResponseApiModel.h && this.i == metaDataCityAgencyResponseApiModel.i && this.j == metaDataCityAgencyResponseApiModel.j && this.k == metaDataCityAgencyResponseApiModel.k && this.l == metaDataCityAgencyResponseApiModel.l;
    }

    public final int hashCode() {
        String str = this.f8838a;
        return ((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.b) * 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31) + (this.h ? 1231 : 1237)) * 31) + (this.i ? 1231 : 1237)) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.k ? 1231 : 1237)) * 31) + (this.l ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "MetaDataCityAgencyResponseApiModel(agencyName=", this.f8838a, ", priority=", ", liveFeed=");
        z40.r(sbM, this.c, ", passBooking=", this.d, ", newPassBooking=");
        z40.r(sbM, this.e, ", isProductAvailable=", this.f, ", isOnlineCardRechargeAvailable=");
        z40.r(sbM, this.g, ", enableQuickPay=", this.h, ", enableWallet=");
        z40.r(sbM, this.i, ", enableClosedLoopWallet=", this.j, ", isOndcProductAvailable=");
        return n21.h(sbM, this.k, ", ticketBooking=", this.l, ")");
    }
}

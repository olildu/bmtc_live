package app.chalo.validationsdk.blevalidation.data.models.api;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/api/PremiumBusPunchDataOverBleApiModel;", "Lapp/chalo/validationsdk/blevalidation/data/models/api/DataOverBleApiModel;", "Companion", "$serializer", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class PremiumBusPunchDataOverBleApiModel extends DataOverBleApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final String b;
    public final String c;
    public final String d;
    public final Long e;
    public final String f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/validationsdk/blevalidation/data/models/api/PremiumBusPunchDataOverBleApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/validationsdk/blevalidation/data/models/api/PremiumBusPunchDataOverBleApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PremiumBusPunchDataOverBleApiModel> serializer() {
            return PremiumBusPunchDataOverBleApiModel$$serializer.f10487a;
        }
    }

    public /* synthetic */ PremiumBusPunchDataOverBleApiModel(int i, String str, String str2, String str3, Long l, String str4) {
        if ((i & 1) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 2) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 8) == 0) {
            this.e = null;
        } else {
            this.e = l;
        }
        if ((i & 16) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
    }
}

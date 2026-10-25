package app.chalo.titoridedetail.data.app;

import defpackage.cb0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TapOutDetailAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TapOutDetailAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f9675a;
    public final Long b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/titoridedetail/data/app/TapOutDetailAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/titoridedetail/data/app/TapOutDetailAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TapOutDetailAppModel> serializer() {
            return TapOutDetailAppModel$$serializer.f9676a;
        }
    }

    public /* synthetic */ TapOutDetailAppModel(int i, Long l, Long l2, String str, String str2, String str3, Long l3) {
        if ((i & 1) == 0) {
            this.f9675a = null;
        } else {
            this.f9675a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TapOutDetailAppModel)) {
            return false;
        }
        TapOutDetailAppModel tapOutDetailAppModel = (TapOutDetailAppModel) obj;
        return Intrinsics.d(this.f9675a, tapOutDetailAppModel.f9675a) && Intrinsics.d(this.b, tapOutDetailAppModel.b) && Intrinsics.d(this.c, tapOutDetailAppModel.c) && Intrinsics.d(this.d, tapOutDetailAppModel.d) && Intrinsics.d(this.e, tapOutDetailAppModel.e) && Intrinsics.d(this.f, tapOutDetailAppModel.f);
    }

    public final int hashCode() {
        Long l = this.f9675a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.b;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.f;
        return iHashCode5 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TapOutDetailAppModel(tapOutGroupNo=");
        sb.append(this.f9675a);
        sb.append(", tapOutTimestampInMillis=");
        sb.append(this.b);
        sb.append(", tapOutRouteId=");
        cb0.t(sb, this.c, ", tapOutStopId=", this.d, ", tapOutTripNo=");
        sb.append(this.e);
        sb.append(", tapOutWaybillNo=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }

    public TapOutDetailAppModel(Long l, Long l2, String str, String str2, String str3, Long l3) {
        this.f9675a = l;
        this.b = l2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = l3;
    }
}

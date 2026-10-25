package app.chalo.home.data.model.api;

import defpackage.cb0;
import defpackage.dd;
import defpackage.sf;
import defpackage.vo1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/ChaloBusHeaderApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ChaloBusHeaderApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f = {null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sf(18)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2880a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/ChaloBusHeaderApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/ChaloBusHeaderApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ChaloBusHeaderApiModel> serializer() {
            return ChaloBusHeaderApiModel$$serializer.f2881a;
        }
    }

    public /* synthetic */ ChaloBusHeaderApiModel(int i, String str, String str2, String str3, String str4, List list) {
        if ((i & 1) == 0) {
            this.f2880a = null;
        } else {
            this.f2880a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChaloBusHeaderApiModel)) {
            return false;
        }
        ChaloBusHeaderApiModel chaloBusHeaderApiModel = (ChaloBusHeaderApiModel) obj;
        return Intrinsics.d(this.f2880a, chaloBusHeaderApiModel.f2880a) && Intrinsics.d(this.b, chaloBusHeaderApiModel.b) && Intrinsics.d(this.c, chaloBusHeaderApiModel.c) && Intrinsics.d(this.d, chaloBusHeaderApiModel.d) && Intrinsics.d(this.e, chaloBusHeaderApiModel.e);
    }

    public final int hashCode() {
        String str = this.f2880a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("ChaloBusHeaderApiModel(icon=", this.f2880a, ", title=", this.b, ", tagList=");
        cb0.s(", imageUrl=", this.d, ", fullContentImageUrl=", sbE, this.c);
        return vo1.p(sbE, this.e, ")");
    }
}

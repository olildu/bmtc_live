package app.chalo.home.data.model.app.response;

import defpackage.dd;
import defpackage.nf1;
import defpackage.sr;
import defpackage.uf0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/app/response/CorridorAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CorridorAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sr(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2959a;
    public final String b;
    public final String c;
    public final List d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/app/response/CorridorAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/app/response/CorridorAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CorridorAppModel> serializer() {
            return CorridorAppModel$$serializer.f2960a;
        }
    }

    public /* synthetic */ CorridorAppModel(int i, String str, String str2, String str3, List list) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(CorridorAppModel$$serializer.f2960a.getDescriptor(), i, 15);
            throw null;
        }
        this.f2959a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CorridorAppModel)) {
            return false;
        }
        CorridorAppModel corridorAppModel = (CorridorAppModel) obj;
        return Intrinsics.d(this.f2959a, corridorAppModel.f2959a) && Intrinsics.d(this.b, corridorAppModel.b) && Intrinsics.d(this.c, corridorAppModel.c) && Intrinsics.d(this.d, corridorAppModel.d);
    }

    public final int hashCode() {
        String str = this.f2959a;
        return this.d.hashCode() + nf1.e(nf1.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return uf0.p(this.c, ", routes=", ")", dd.e("CorridorAppModel(displayName=", this.f2959a, ", start=", this.b, ", end="), this.d);
    }

    public CorridorAppModel(String str, String start, String end, List list) {
        Intrinsics.i(start, "start");
        Intrinsics.i(end, "end");
        this.f2959a = str;
        this.b = start;
        this.c = end;
        this.d = list;
    }
}

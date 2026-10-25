package app.chalo.home.data.model.api;

import defpackage.ea0;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/ItemTextDataApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class ItemTextDataApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2890a;
    public final List b;
    public final ChaloTextDataApiModel c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/ItemTextDataApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/ItemTextDataApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<ItemTextDataApiModel> serializer() {
            return ItemTextDataApiModel$$serializer.f2891a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        d = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ea0(21)), LazyKt.a(lazyThreadSafetyMode, new ea0(22)), null};
    }

    public /* synthetic */ ItemTextDataApiModel(int i, List list, List list2, ChaloTextDataApiModel chaloTextDataApiModel) {
        if ((i & 1) == 0) {
            this.f2890a = null;
        } else {
            this.f2890a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = chaloTextDataApiModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemTextDataApiModel)) {
            return false;
        }
        ItemTextDataApiModel itemTextDataApiModel = (ItemTextDataApiModel) obj;
        return Intrinsics.d(this.f2890a, itemTextDataApiModel.f2890a) && Intrinsics.d(this.b, itemTextDataApiModel.b) && Intrinsics.d(this.c, itemTextDataApiModel.c);
    }

    public final int hashCode() {
        List list = this.f2890a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        ChaloTextDataApiModel chaloTextDataApiModel = this.c;
        return iHashCode2 + (chaloTextDataApiModel != null ? chaloTextDataApiModel.hashCode() : 0);
    }

    public final String toString() {
        return "ItemTextDataApiModel(desc=" + this.f2890a + ", tags=" + this.b + ", title=" + this.c + ")";
    }
}

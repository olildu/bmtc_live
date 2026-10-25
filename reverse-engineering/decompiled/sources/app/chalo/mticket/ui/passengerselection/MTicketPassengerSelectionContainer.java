package app.chalo.mticket.ui.passengerselection;

import app.chalo.extensions.StringExtsKt;
import app.chalo.productpurchase.productselection.data.models.app.UnknownProductCategoryResponseAppModel;
import defpackage.r1;
import defpackage.sg0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionContainer;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class MTicketPassengerSelectionContainer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new sg0(3))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5741a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionContainer$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/mticket/ui/passengerselection/MTicketPassengerSelectionContainer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static MTicketPassengerSelectionContainer a(MTicketPassengerSelectionContainer mTicketPassengerSelectionContainer, ArrayList arrayList) {
            Map mapD;
            List list;
            if (mTicketPassengerSelectionContainer == null || (list = mTicketPassengerSelectionContainer.f5741a) == null) {
                mapD = MapsKt.d();
            } else {
                List list2 = list;
                int iG = MapsKt.g(CollectionsKt.v(list2, 10));
                if (iG < 16) {
                    iG = 16;
                }
                mapD = new LinkedHashMap(iG);
                for (Object obj : list2) {
                    mapD.put(((MTicketPassengerItem) obj).f5734a, obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            boolean z = true;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                UnknownProductCategoryResponseAppModel unknownProductCategoryResponseAppModel = (UnknownProductCategoryResponseAppModel) obj2;
                boolean z2 = unknownProductCategoryResponseAppModel.f;
                String str = unknownProductCategoryResponseAppModel.f8648a;
                MTicketPassengerItem mTicketPassengerItem = null;
                Integer numValueOf = null;
                if (z2) {
                    MTicketPassengerItem mTicketPassengerItem2 = (MTicketPassengerItem) mapD.get(str);
                    if (mTicketPassengerItem2 != null) {
                        z = z;
                        numValueOf = Integer.valueOf(mTicketPassengerItem2.c);
                    }
                    mTicketPassengerItem = new MTicketPassengerItem(str, numValueOf != null ? numValueOf.intValue() : z ? 1 : 0, false, StringExtsKt.b(unknownProductCategoryResponseAppModel.b, str), unknownProductCategoryResponseAppModel.k, 0);
                    z = false;
                }
                if (mTicketPassengerItem != null) {
                    arrayList2.add(mTicketPassengerItem);
                }
            }
            return new MTicketPassengerSelectionContainer(b(arrayList2));
        }

        public static List b(ArrayList arrayList) {
            if (arrayList.size() > 1) {
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.v(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList2.add(MTicketPassengerItem.a((MTicketPassengerItem) obj, 0, 47));
            }
            return arrayList2;
        }

        public final KSerializer<MTicketPassengerSelectionContainer> serializer() {
            return MTicketPassengerSelectionContainer$$serializer.f5742a;
        }
    }

    public /* synthetic */ MTicketPassengerSelectionContainer(int i, List list) {
        if (1 == (i & 1)) {
            this.f5741a = list;
        } else {
            PluginExceptionsKt.b(MTicketPassengerSelectionContainer$$serializer.f5742a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MTicketPassengerSelectionContainer) && Intrinsics.d(this.f5741a, ((MTicketPassengerSelectionContainer) obj).f5741a);
    }

    public final int hashCode() {
        return this.f5741a.hashCode();
    }

    public final String toString() {
        return r1.d("MTicketPassengerSelectionContainer(sectionItems=", ")", this.f5741a);
    }

    public MTicketPassengerSelectionContainer(List list) {
        this.f5741a = list;
    }
}

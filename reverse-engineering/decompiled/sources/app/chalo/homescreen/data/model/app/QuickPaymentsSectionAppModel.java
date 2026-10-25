package app.chalo.homescreen.data.model.app;

import defpackage.hz0;
import defpackage.nf1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class QuickPaymentsSectionAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new hz0(6))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3785a;
    public final List b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/QuickPaymentsSectionAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<QuickPaymentsSectionAppModel> serializer() {
            return QuickPaymentsSectionAppModel$$serializer.f3786a;
        }
    }

    public QuickPaymentsSectionAppModel(int i, String str, List list) {
        this.f3785a = (i & 1) == 0 ? null : str;
        if ((i & 2) == 0) {
            this.b = EmptyList.f17557a;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickPaymentsSectionAppModel)) {
            return false;
        }
        QuickPaymentsSectionAppModel quickPaymentsSectionAppModel = (QuickPaymentsSectionAppModel) obj;
        return Intrinsics.d(this.f3785a, quickPaymentsSectionAppModel.f3785a) && Intrinsics.d(this.b, quickPaymentsSectionAppModel.b);
    }

    public final int hashCode() {
        String str = this.f3785a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return nf1.m("QuickPaymentsSectionAppModel(sectionHeader=", this.f3785a, ", sectionDataList=", ")", this.b);
    }

    public QuickPaymentsSectionAppModel(String str, ArrayList arrayList) {
        this.f3785a = str;
        this.b = arrayList;
    }
}

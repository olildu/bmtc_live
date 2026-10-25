package app.chalo.homescreen.data.model.app;

import defpackage.vo1;
import defpackage.xi1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/homescreen/data/model/app/TicketsPassesAppModel;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TicketsPassesAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xi1(6)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketsPassesSectionWidgetAppModel f3816a;
    public final TabMetaDataAppModel b;
    public final String c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/TicketsPassesAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/TicketsPassesAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TicketsPassesAppModel> serializer() {
            return TicketsPassesAppModel$$serializer.f3817a;
        }
    }

    public /* synthetic */ TicketsPassesAppModel(int i, TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel, TabMetaDataAppModel tabMetaDataAppModel, String str) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(TicketsPassesAppModel$$serializer.f3817a.getDescriptor(), i, 7);
            throw null;
        }
        this.f3816a = ticketsPassesSectionWidgetAppModel;
        this.b = tabMetaDataAppModel;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketsPassesAppModel)) {
            return false;
        }
        TicketsPassesAppModel ticketsPassesAppModel = (TicketsPassesAppModel) obj;
        return Intrinsics.d(this.f3816a, ticketsPassesAppModel.f3816a) && Intrinsics.d(this.b, ticketsPassesAppModel.b) && Intrinsics.d(this.c, ticketsPassesAppModel.c);
    }

    public final int hashCode() {
        TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel = this.f3816a;
        return this.c.hashCode() + ((this.b.hashCode() + ((ticketsPassesSectionWidgetAppModel == null ? 0 : ticketsPassesSectionWidgetAppModel.hashCode()) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketsPassesAppModel(ticketsPageSection=");
        sb.append(this.f3816a);
        sb.append(", headerMetaDataAppModel=");
        sb.append(this.b);
        sb.append(", busService=");
        return vo1.p(sb, this.c, ")");
    }

    public TicketsPassesAppModel(TicketsPassesSectionWidgetAppModel ticketsPassesSectionWidgetAppModel, TabMetaDataAppModel tabMetaDataAppModel, String str) {
        this.f3816a = ticketsPassesSectionWidgetAppModel;
        this.b = tabMetaDataAppModel;
        this.c = str;
    }
}

package app.chalo.homescreen.data.model.app;

import defpackage.xi1;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/homescreen/data/model/app/TicketsPassesSectionWidgetAppModel;", "", "Companion", "TicketsTabHooksSectionWidgetAppModel", "PurchaseProductCardWidgetAppModel", "Lapp/chalo/homescreen/data/model/app/TicketsPassesSectionWidgetAppModel$PurchaseProductCardWidgetAppModel;", "Lapp/chalo/homescreen/data/model/app/TicketsPassesSectionWidgetAppModel$TicketsTabHooksSectionWidgetAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class TicketsPassesSectionWidgetAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] b;
    public static final Object c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3818a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/homescreen/data/model/app/TicketsPassesSectionWidgetAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/homescreen/data/model/app/TicketsPassesSectionWidgetAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<TicketsPassesSectionWidgetAppModel> serializer() {
            return (KSerializer) TicketsPassesSectionWidgetAppModel.c.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/TicketsPassesSectionWidgetAppModel$PurchaseProductCardWidgetAppModel;", "Lapp/chalo/homescreen/data/model/app/TicketsPassesSectionWidgetAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PurchaseProductCardWidgetAppModel extends TicketsPassesSectionWidgetAppModel {
        public final PurchaseProductCardAppModel d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PurchaseProductCardWidgetAppModel(String widgetSectionId, TicketsPageSectionType widgetSectionType, String str, PurchaseProductCardAppModel purchaseProductCardAppModel) {
            super(str);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.d = purchaseProductCardAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/homescreen/data/model/app/TicketsPassesSectionWidgetAppModel$TicketsTabHooksSectionWidgetAppModel;", "Lapp/chalo/homescreen/data/model/app/TicketsPassesSectionWidgetAppModel;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TicketsTabHooksSectionWidgetAppModel extends TicketsPassesSectionWidgetAppModel {
        public final TicketsTabHooksSectionAppModel d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TicketsTabHooksSectionWidgetAppModel(String widgetSectionId, TicketsPageSectionType widgetSectionType, String str, TicketsTabHooksSectionAppModel ticketsTabHooksSectionAppModel) {
            super(str);
            Intrinsics.i(widgetSectionId, "widgetSectionId");
            Intrinsics.i(widgetSectionType, "widgetSectionType");
            this.d = ticketsTabHooksSectionAppModel;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        b = new Lazy[]{null, null, LazyKt.a(lazyThreadSafetyMode, new xi1(7)), null};
        c = LazyKt.a(lazyThreadSafetyMode, new xi1(8));
    }

    public TicketsPassesSectionWidgetAppModel(String str) {
        this.f3818a = str;
    }
}

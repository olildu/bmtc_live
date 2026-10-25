package app.chalo.routeselection.ui;

import app.chalo.citydata.data.model.app.StopAppModel;
import app.chalo.productbooking.common.data.models.app.OriginDestinationAppModel;
import app.chalo.providers.RouteNamingSchemeType;
import app.chalo.uistate.searchbar.SearchBarWithActionUIState;
import defpackage.g41;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.routeselection.ui.StopBasedRouteSearchForProductPurchaseComponent$handleRouteSearchQueryChangeIntent$1", f = "StopBasedRouteSearchForProductPurchaseComponent.kt", l = {1010}, m = "invokeSuspend", v = 1)
final class StopBasedRouteSearchForProductPurchaseComponent$handleRouteSearchQueryChangeIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $query;
    int label;
    final /* synthetic */ StopBasedRouteSearchForProductPurchaseComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StopBasedRouteSearchForProductPurchaseComponent$handleRouteSearchQueryChangeIntent$1(StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = stopBasedRouteSearchForProductPurchaseComponent;
        this.$query = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new StopBasedRouteSearchForProductPurchaseComponent$handleRouteSearchQueryChangeIntent$1(this.this$0, this.$query, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((StopBasedRouteSearchForProductPurchaseComponent$handleRouteSearchQueryChangeIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x007c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list;
        boolean zM;
        String str;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent = this.this$0;
            String str3 = this.$query;
            this.label = 1;
            obj = stopBasedRouteSearchForProductPurchaseComponent.L0(str3, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        SearchBarWithActionUIState searchBarWithActionUIState = (SearchBarWithActionUIState) obj;
        if (this.$query.length() == 0) {
            list = this.this$0.G;
        } else {
            List list2 = this.this$0.G;
            String str4 = this.$query;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list2) {
                OriginDestinationAppModel originDestinationAppModel = (OriginDestinationAppModel) obj2;
                RouteNamingSchemeType routeNamingSchemeType = originDestinationAppModel.j;
                StopAppModel stopAppModel = originDestinationAppModel.f;
                int i2 = StopBasedRouteSearchForProductPurchaseComponent.WhenMappings.f9191a[routeNamingSchemeType.ordinal()];
                boolean z = false;
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (StringsKt.m(originDestinationAppModel.b, str4, true) || !(stopAppModel == null || (str2 = stopAppModel.b) == null || !StringsKt.m(str2, str4, true))) {
                        zM = true;
                    } else {
                        zM = false;
                    }
                } else if (stopAppModel == null || (str = stopAppModel.b) == null || !StringsKt.m(str, str4, true)) {
                    String str5 = originDestinationAppModel.i;
                    if (str5 != null) {
                        zM = StringsKt.m(str5, str4, true);
                    } else {
                        zM = false;
                    }
                } else {
                    zM = true;
                }
                if (zM) {
                    z = true;
                    break;
                }
                List list3 = originDestinationAppModel.g;
                if (list3.isEmpty()) {
                    list3 = originDestinationAppModel.h;
                }
                List list4 = list3;
                if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        if (StringsKt.m((String) it.next(), str4, true)) {
                            z = true;
                            break;
                        }
                    }
                }
                if (z) {
                    arrayList.add(obj2);
                }
            }
            list = arrayList;
        }
        this.this$0.getClass();
        ArrayList arrayListK0 = StopBasedRouteSearchForProductPurchaseComponent.K0(list);
        StopBasedRouteSearchForProductPurchaseComponent stopBasedRouteSearchForProductPurchaseComponent2 = this.this$0;
        StopAppModel stopAppModel2 = stopBasedRouteSearchForProductPurchaseComponent2.B;
        String str6 = stopAppModel2 != null ? stopAppModel2.b : null;
        StopAppModel stopAppModel3 = stopBasedRouteSearchForProductPurchaseComponent2.C;
        this.this$0.E0(new g41(15, new RouteSelectionBottomSheetType.MultipleRouteAvailable(str6, stopAppModel3 != null ? stopAppModel3.b : null, arrayListK0), searchBarWithActionUIState));
        return Unit.f17538a;
    }
}

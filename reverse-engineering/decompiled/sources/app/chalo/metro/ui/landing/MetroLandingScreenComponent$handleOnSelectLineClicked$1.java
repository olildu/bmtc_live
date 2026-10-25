package app.chalo.metro.ui.landing;

import app.chalo.ondc.domain.FetchOndcMetroLinesUseCase;
import app.chalo.ondc.model.app.OndcMetroRouteSearchAppModel;
import app.chalo.ondc.model.app.OndcMetroRouteSearchResultAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.qi0;
import defpackage.xg0;
import defpackage.za0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.metro.ui.landing.MetroLandingScreenComponent$handleOnSelectLineClicked$1", f = "MetroLandingScreenComponent.kt", l = {536, 538}, m = "invokeSuspend", v = 1)
final class MetroLandingScreenComponent$handleOnSelectLineClicked$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ MetroLandingScreenComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetroLandingScreenComponent$handleOnSelectLineClicked$1(MetroLandingScreenComponent metroLandingScreenComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = metroLandingScreenComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MetroLandingScreenComponent$handleOnSelectLineClicked$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MetroLandingScreenComponent$handleOnSelectLineClicked$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d4 A[LOOP:0: B:40:0x00d2->B:41:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        MetroLandingScreenComponent metroLandingScreenComponent;
        MetroLandingScreenBottomSheetType metroLandingScreenBottomSheetType;
        Map mapD;
        int iG;
        int size;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 0;
        if (i == 0) {
            ResultKt.b(obj);
            List list = ((MetroLandingScreenDataState) this.this$0.f.getValue()).g;
            if (list == null || list.isEmpty()) {
                this.this$0.E0(new xg0(29));
                FetchOndcMetroLinesUseCase fetchOndcMetroLinesUseCase = this.this$0.q;
                this.label = 1;
                obj = fetchOndcMetroLinesUseCase.a(this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            this.this$0.E0(new qi0(0));
            return Unit.f17538a;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            metroLandingScreenComponent = (MetroLandingScreenComponent) this.L$0;
            ResultKt.b(obj);
        }
        MetroLandingScreenComponent.Q0(metroLandingScreenComponent, (String) obj);
        arrayList = null;
        if (arrayList == null) {
            metroLandingScreenBottomSheetType = MetroLandingScreenBottomSheetType.None;
        } else {
            metroLandingScreenBottomSheetType = MetroLandingScreenBottomSheetType.LineSelectionBottomSheet;
        }
        if (arrayList != null) {
            iG = MapsKt.g(CollectionsKt.v(arrayList, 10));
            if (iG < 16) {
                iG = 16;
            }
            mapD = new LinkedHashMap(iG);
            size = arrayList.size();
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                mapD.put(((MetroLineListItemState) obj2).f5509a.f6766a, EmptyList.f17557a);
            }
        } else {
            mapD = MapsKt.d();
        }
        this.this$0.E0(new za0(7, mapD, arrayList, metroLandingScreenBottomSheetType));
        return Unit.f17538a;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            MetroLandingScreenComponent metroLandingScreenComponent2 = this.this$0;
            this.L$0 = metroLandingScreenComponent2;
            this.label = 2;
            Object objB = metroLandingScreenComponent2.l.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], this);
            if (objB != coroutineSingletons) {
                metroLandingScreenComponent = metroLandingScreenComponent2;
                obj = objB;
                MetroLandingScreenComponent.Q0(metroLandingScreenComponent, (String) obj);
                arrayList = null;
            }
            return coroutineSingletons;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            throw new NoWhenBranchMatchedException();
        }
        ArrayList arrayList2 = ((OndcMetroRouteSearchResultAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f6768a;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.v(arrayList2, 10));
        int size2 = arrayList2.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            arrayList3.add(new MetroLineListItemState((OndcMetroRouteSearchAppModel) obj3, false));
        }
        arrayList = arrayList3;
        if (arrayList == null) {
            metroLandingScreenBottomSheetType = MetroLandingScreenBottomSheetType.None;
        } else {
            metroLandingScreenBottomSheetType = MetroLandingScreenBottomSheetType.LineSelectionBottomSheet;
        }
        if (arrayList != null) {
            iG = MapsKt.g(CollectionsKt.v(arrayList, 10));
            if (iG < 16) {
                iG = 16;
            }
            mapD = new LinkedHashMap(iG);
            size = arrayList.size();
            while (i2 < size) {
                Object obj4 = arrayList.get(i2);
                i2++;
                mapD.put(((MetroLineListItemState) obj4).f5509a.f6766a, EmptyList.f17557a);
            }
        } else {
            mapD = MapsKt.d();
        }
        this.this$0.E0(new za0(7, mapD, arrayList, metroLandingScreenBottomSheetType));
        return Unit.f17538a;
    }
}

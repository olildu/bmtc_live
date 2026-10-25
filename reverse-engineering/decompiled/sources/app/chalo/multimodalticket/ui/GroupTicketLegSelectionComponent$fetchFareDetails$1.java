package app.chalo.multimodalticket.ui;

import app.chalo.constants.Source;
import app.chalo.login.LoginAuthGuard;
import app.chalo.login.LoginAuthGuardKt;
import app.chalo.login.LoginGuardResult;
import app.chalo.multimodalticket.data.model.app.GroupTicketBookingFareResponseAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketCategoryFareDetailsAppModel;
import app.chalo.multimodalticket.domain.FetchGroupTicketBookingFareDetailsUseCase;
import app.chalo.productbooking.common.data.error.ProductBookingDataSourceError;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.toast.ToastLength;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.e40;
import defpackage.u;
import defpackage.z20;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.multimodalticket.ui.GroupTicketLegSelectionComponent$fetchFareDetails$1", f = "GroupTicketLegSelectionComponent.kt", l = {268, 273, 281, 287, 292, 302}, m = "invokeSuspend", v = 1)
final class GroupTicketLegSelectionComponent$fetchFareDetails$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GroupTicketLegSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GroupTicketLegSelectionComponent$fetchFareDetails$1(GroupTicketLegSelectionComponent groupTicketLegSelectionComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = groupTicketLegSelectionComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GroupTicketLegSelectionComponent$fetchFareDetails$1 groupTicketLegSelectionComponent$fetchFareDetails$1 = new GroupTicketLegSelectionComponent$fetchFareDetails$1(this.this$0, continuation);
        groupTicketLegSelectionComponent$fetchFareDetails$1.L$0 = obj;
        return groupTicketLegSelectionComponent$fetchFareDetails$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((GroupTicketLegSelectionComponent$fetchFareDetails$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b A[PHI: r1 r5 r6 r15
      0x010b: PHI (r1v9 java.util.List) = (r1v27 java.util.List), (r1v28 java.util.List) binds: [B:42:0x0108, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r5v5 app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState) = 
      (r5v2 app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState)
      (r5v7 app.chalo.multimodalticket.ui.GroupTicketLegSelectionDataState)
     binds: [B:42:0x0108, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r6v5 kotlinx.coroutines.CoroutineScope) = (r6v2 kotlinx.coroutines.CoroutineScope), (r6v7 kotlinx.coroutines.CoroutineScope) binds: [B:42:0x0108, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]
      0x010b: PHI (r15v28 java.lang.Object) = (r15v26 java.lang.Object), (r15v0 java.lang.Object) binds: [B:42:0x0108, B:7:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x011c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x011e  */
    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0147  */
    /* JADX WARN: Code duplicated, block: B:57:0x0157  */
    /* JADX WARN: Code duplicated, block: B:59:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x01b1 A[LOOP:0: B:61:0x01af->B:62:0x01b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:69:0x022d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        GroupTicketLegSelectionDataState groupTicketLegSelectionDataState;
        List list;
        List list2;
        int i;
        List list3;
        GroupTicketLegSelectionDataState groupTicketLegSelectionDataState2;
        CoroutineScope coroutineScope2;
        ChaloUseCaseResult chaloUseCaseResult;
        ArrayList arrayList;
        int iG;
        LinkedHashMap linkedHashMap;
        int size;
        int i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        Unit unit = Unit.f17538a;
        switch (i3) {
            case 0:
                ResultKt.b(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                groupTicketLegSelectionDataState = (GroupTicketLegSelectionDataState) this.this$0.f.getValue();
                if (groupTicketLegSelectionDataState.e.isEmpty()) {
                    GroupTicketLegSelectionComponent groupTicketLegSelectionComponent = this.this$0;
                    StringEnum stringEnum = StringEnum.SOMETHING_WENT_WRONG;
                    this.label = 1;
                    if (groupTicketLegSelectionComponent.M0(stringEnum, ToastLength.SHORT, this) != coroutineSingletons) {
                        return unit;
                    }
                    list2 = list;
                    return coroutineSingletons;
                }
                if (StringsKt.F(groupTicketLegSelectionDataState.d)) {
                    GroupTicketLegSelectionComponent groupTicketLegSelectionComponent2 = this.this$0;
                    StringEnum stringEnum2 = StringEnum.SOMETHING_WENT_WRONG;
                    this.label = 2;
                    if (groupTicketLegSelectionComponent2.M0(stringEnum2, ToastLength.SHORT, this) != coroutineSingletons) {
                        return unit;
                    }
                    list2 = list;
                    return coroutineSingletons;
                }
                this.this$0.getClass();
                ArrayList arrayListJ0 = GroupTicketLegSelectionComponent.J0(groupTicketLegSelectionDataState);
                this.this$0.getClass();
                if (groupTicketLegSelectionDataState.f5931a != GroupTicketJourneySelectionMode.FullJourney && arrayListJ0.isEmpty()) {
                    GroupTicketLegSelectionComponent groupTicketLegSelectionComponent3 = this.this$0;
                    StringEnum stringEnum3 = StringEnum.SELECT_AT_LEAST_ONE_STEP_MSG;
                    this.label = 3;
                    if (groupTicketLegSelectionComponent3.M0(stringEnum3, ToastLength.SHORT, this) != coroutineSingletons) {
                        return unit;
                    }
                } else {
                    this.this$0.E0(new z20(24));
                    GroupTicketLegSelectionComponent groupTicketLegSelectionComponent4 = this.this$0;
                    this.L$0 = coroutineScope;
                    this.L$1 = groupTicketLegSelectionDataState;
                    this.L$2 = arrayListJ0;
                    this.label = 4;
                    obj = GroupTicketLegSelectionComponent.F0(groupTicketLegSelectionComponent4, arrayListJ0, this);
                    list = arrayListJ0;
                    if (obj != coroutineSingletons) {
                        if (((Boolean) obj).booleanValue()) {
                            this.this$0.E0(new z20(25));
                            return unit;
                        }
                        GroupTicketLegSelectionComponent groupTicketLegSelectionComponent5 = this.this$0;
                        LoginAuthGuard loginAuthGuard = groupTicketLegSelectionComponent5.u;
                        Source source = Source.GROUP_TICKET_LEG_SELECTION_SCREEN;
                        this.L$0 = coroutineScope;
                        this.L$1 = groupTicketLegSelectionDataState;
                        this.L$2 = list;
                        this.label = 5;
                        obj = loginAuthGuard.a(source, groupTicketLegSelectionComponent5, this);
                        if (obj != coroutineSingletons) {
                            list2 = list;
                            LoginGuardResult loginGuardResult = (LoginGuardResult) obj;
                            Intrinsics.i(loginGuardResult, "<this>");
                            i = LoginAuthGuardKt.WhenMappings.f5180a[loginGuardResult.ordinal()];
                            if (i != 1) {
                                if (i != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                this.this$0.E0(new z20(26));
                                return unit;
                            }
                            FetchGroupTicketBookingFareDetailsUseCase fetchGroupTicketBookingFareDetailsUseCase = this.this$0.m;
                            String str = groupTicketLegSelectionDataState.d;
                            this.L$0 = coroutineScope;
                            this.L$1 = groupTicketLegSelectionDataState;
                            this.L$2 = list2;
                            this.label = 6;
                            obj = fetchGroupTicketBookingFareDetailsUseCase.b(str, list2, this);
                            if (obj != coroutineSingletons) {
                                list3 = list2;
                                groupTicketLegSelectionDataState2 = groupTicketLegSelectionDataState;
                                coroutineScope2 = coroutineScope;
                                chaloUseCaseResult = (ChaloUseCaseResult) obj;
                                CoroutineScopeKt.d(coroutineScope2);
                                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    GroupTicketLegSelectionComponent groupTicketLegSelectionComponent6 = this.this$0;
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.putAll(GroupTicketLegSelectionComponent.I0(this.this$0, groupTicketLegSelectionDataState2, list3));
                                    ProductBookingDataSourceError productBookingDataSourceError = (ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                                    linkedHashMap2.put("error", productBookingDataSourceError.toString());
                                    groupTicketLegSelectionComponent6.O0("gt leg fetch fare failure", linkedHashMap2);
                                    GroupTicketLegSelectionComponent groupTicketLegSelectionComponent7 = this.this$0;
                                    groupTicketLegSelectionComponent7.getClass();
                                    groupTicketLegSelectionComponent7.O0("gt leg selection bs triggered", MapsKt.h(new Pair("groupTicketBottomSheetType", "error type")));
                                    groupTicketLegSelectionComponent7.E0(new e40(productBookingDataSourceError, 3));
                                    return unit;
                                }
                                GroupTicketLegSelectionComponent groupTicketLegSelectionComponent8 = this.this$0;
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                linkedHashMap3.putAll(GroupTicketLegSelectionComponent.I0(this.this$0, groupTicketLegSelectionDataState2, list3));
                                GroupTicketBookingFareResponseAppModel groupTicketBookingFareResponseAppModel = (GroupTicketBookingFareResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                                linkedHashMap3.put("groupTicketCategoriesCount", String.valueOf(groupTicketBookingFareResponseAppModel.c.size()));
                                groupTicketLegSelectionComponent8.O0("gt leg fetch fare success", linkedHashMap3);
                                GroupTicketLegSelectionComponent groupTicketLegSelectionComponent9 = this.this$0;
                                groupTicketLegSelectionComponent9.getClass();
                                groupTicketLegSelectionComponent9.O0("gt leg selection bs triggered", MapsKt.h(new Pair("groupTicketBottomSheetType", "passenger selection type")));
                                arrayList = groupTicketBookingFareResponseAppModel.c;
                                iG = MapsKt.g(CollectionsKt.v(arrayList, 10));
                                if (iG < 16) {
                                    iG = 16;
                                }
                                linkedHashMap = new LinkedHashMap(iG);
                                size = arrayList.size();
                                i2 = 0;
                                while (i2 < size) {
                                    Object obj2 = arrayList.get(i2);
                                    i2++;
                                    GroupTicketCategoryFareDetailsAppModel groupTicketCategoryFareDetailsAppModel = (GroupTicketCategoryFareDetailsAppModel) obj2;
                                    Pair pair = new Pair(groupTicketCategoryFareDetailsAppModel.f5851a, new GroupTicketPassengerSelectionDataState(groupTicketCategoryFareDetailsAppModel, false, groupTicketCategoryFareDetailsAppModel.e, false, false));
                                    linkedHashMap.put(pair.d(), pair.e());
                                }
                                groupTicketLegSelectionComponent9.E0(new u(26, groupTicketBookingFareResponseAppModel, list3, GroupTicketLegSelectionComponent.Q0(linkedHashMap, groupTicketBookingFareResponseAppModel.b)));
                                return unit;
                            }
                        }
                    }
                }
                list2 = list;
                return coroutineSingletons;
            case 1:
                ResultKt.b(obj);
                return unit;
            case 2:
                ResultKt.b(obj);
                return unit;
            case 3:
                ResultKt.b(obj);
                return unit;
            case 4:
                List list4 = (List) this.L$2;
                groupTicketLegSelectionDataState = (GroupTicketLegSelectionDataState) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
                list = list4;
                if (((Boolean) obj).booleanValue()) {
                    this.this$0.E0(new z20(25));
                    return unit;
                }
                GroupTicketLegSelectionComponent groupTicketLegSelectionComponent10 = this.this$0;
                LoginAuthGuard loginAuthGuard2 = groupTicketLegSelectionComponent10.u;
                Source source2 = Source.GROUP_TICKET_LEG_SELECTION_SCREEN;
                this.L$0 = coroutineScope;
                this.L$1 = groupTicketLegSelectionDataState;
                this.L$2 = list;
                this.label = 5;
                obj = loginAuthGuard2.a(source2, groupTicketLegSelectionComponent10, this);
                if (obj != coroutineSingletons) {
                    list2 = list;
                    LoginGuardResult loginGuardResult2 = (LoginGuardResult) obj;
                    Intrinsics.i(loginGuardResult2, "<this>");
                    i = LoginAuthGuardKt.WhenMappings.f5180a[loginGuardResult2.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.this$0.E0(new z20(26));
                        return unit;
                    }
                    FetchGroupTicketBookingFareDetailsUseCase fetchGroupTicketBookingFareDetailsUseCase2 = this.this$0.m;
                    String str2 = groupTicketLegSelectionDataState.d;
                    this.L$0 = coroutineScope;
                    this.L$1 = groupTicketLegSelectionDataState;
                    this.L$2 = list2;
                    this.label = 6;
                    obj = fetchGroupTicketBookingFareDetailsUseCase2.b(str2, list2, this);
                    if (obj != coroutineSingletons) {
                        list3 = list2;
                        groupTicketLegSelectionDataState2 = groupTicketLegSelectionDataState;
                        coroutineScope2 = coroutineScope;
                        chaloUseCaseResult = (ChaloUseCaseResult) obj;
                        CoroutineScopeKt.d(coroutineScope2);
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                throw new NoWhenBranchMatchedException();
                            }
                            GroupTicketLegSelectionComponent groupTicketLegSelectionComponent11 = this.this$0;
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                            linkedHashMap4.putAll(GroupTicketLegSelectionComponent.I0(this.this$0, groupTicketLegSelectionDataState2, list3));
                            ProductBookingDataSourceError productBookingDataSourceError2 = (ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                            linkedHashMap4.put("error", productBookingDataSourceError2.toString());
                            groupTicketLegSelectionComponent11.O0("gt leg fetch fare failure", linkedHashMap4);
                            GroupTicketLegSelectionComponent groupTicketLegSelectionComponent12 = this.this$0;
                            groupTicketLegSelectionComponent12.getClass();
                            groupTicketLegSelectionComponent12.O0("gt leg selection bs triggered", MapsKt.h(new Pair("groupTicketBottomSheetType", "error type")));
                            groupTicketLegSelectionComponent12.E0(new e40(productBookingDataSourceError2, 3));
                            return unit;
                        }
                        GroupTicketLegSelectionComponent groupTicketLegSelectionComponent13 = this.this$0;
                        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
                        linkedHashMap5.putAll(GroupTicketLegSelectionComponent.I0(this.this$0, groupTicketLegSelectionDataState2, list3));
                        GroupTicketBookingFareResponseAppModel groupTicketBookingFareResponseAppModel2 = (GroupTicketBookingFareResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        linkedHashMap5.put("groupTicketCategoriesCount", String.valueOf(groupTicketBookingFareResponseAppModel2.c.size()));
                        groupTicketLegSelectionComponent13.O0("gt leg fetch fare success", linkedHashMap5);
                        GroupTicketLegSelectionComponent groupTicketLegSelectionComponent14 = this.this$0;
                        groupTicketLegSelectionComponent14.getClass();
                        groupTicketLegSelectionComponent14.O0("gt leg selection bs triggered", MapsKt.h(new Pair("groupTicketBottomSheetType", "passenger selection type")));
                        arrayList = groupTicketBookingFareResponseAppModel2.c;
                        iG = MapsKt.g(CollectionsKt.v(arrayList, 10));
                        if (iG < 16) {
                            iG = 16;
                        }
                        linkedHashMap = new LinkedHashMap(iG);
                        size = arrayList.size();
                        i2 = 0;
                        while (i2 < size) {
                            Object obj3 = arrayList.get(i2);
                            i2++;
                            GroupTicketCategoryFareDetailsAppModel groupTicketCategoryFareDetailsAppModel2 = (GroupTicketCategoryFareDetailsAppModel) obj3;
                            Pair pair2 = new Pair(groupTicketCategoryFareDetailsAppModel2.f5851a, new GroupTicketPassengerSelectionDataState(groupTicketCategoryFareDetailsAppModel2, false, groupTicketCategoryFareDetailsAppModel2.e, false, false));
                            linkedHashMap.put(pair2.d(), pair2.e());
                        }
                        groupTicketLegSelectionComponent14.E0(new u(26, groupTicketBookingFareResponseAppModel2, list3, GroupTicketLegSelectionComponent.Q0(linkedHashMap, groupTicketBookingFareResponseAppModel2.b)));
                        return unit;
                    }
                }
                list2 = list;
                return coroutineSingletons;
            case 5:
                List list5 = (List) this.L$2;
                groupTicketLegSelectionDataState = (GroupTicketLegSelectionDataState) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
                list2 = list5;
                list2 = list;
                LoginGuardResult loginGuardResult3 = (LoginGuardResult) obj;
                Intrinsics.i(loginGuardResult3, "<this>");
                i = LoginAuthGuardKt.WhenMappings.f5180a[loginGuardResult3.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.this$0.E0(new z20(26));
                    return unit;
                }
                FetchGroupTicketBookingFareDetailsUseCase fetchGroupTicketBookingFareDetailsUseCase3 = this.this$0.m;
                String str3 = groupTicketLegSelectionDataState.d;
                this.L$0 = coroutineScope;
                this.L$1 = groupTicketLegSelectionDataState;
                this.L$2 = list2;
                this.label = 6;
                obj = fetchGroupTicketBookingFareDetailsUseCase3.b(str3, list2, this);
                if (obj != coroutineSingletons) {
                    list3 = list2;
                    groupTicketLegSelectionDataState2 = groupTicketLegSelectionDataState;
                    coroutineScope2 = coroutineScope;
                    chaloUseCaseResult = (ChaloUseCaseResult) obj;
                    CoroutineScopeKt.d(coroutineScope2);
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            throw new NoWhenBranchMatchedException();
                        }
                        GroupTicketLegSelectionComponent groupTicketLegSelectionComponent15 = this.this$0;
                        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
                        linkedHashMap6.putAll(GroupTicketLegSelectionComponent.I0(this.this$0, groupTicketLegSelectionDataState2, list3));
                        ProductBookingDataSourceError productBookingDataSourceError3 = (ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                        linkedHashMap6.put("error", productBookingDataSourceError3.toString());
                        groupTicketLegSelectionComponent15.O0("gt leg fetch fare failure", linkedHashMap6);
                        GroupTicketLegSelectionComponent groupTicketLegSelectionComponent16 = this.this$0;
                        groupTicketLegSelectionComponent16.getClass();
                        groupTicketLegSelectionComponent16.O0("gt leg selection bs triggered", MapsKt.h(new Pair("groupTicketBottomSheetType", "error type")));
                        groupTicketLegSelectionComponent16.E0(new e40(productBookingDataSourceError3, 3));
                        return unit;
                    }
                    GroupTicketLegSelectionComponent groupTicketLegSelectionComponent17 = this.this$0;
                    LinkedHashMap linkedHashMap7 = new LinkedHashMap();
                    linkedHashMap7.putAll(GroupTicketLegSelectionComponent.I0(this.this$0, groupTicketLegSelectionDataState2, list3));
                    GroupTicketBookingFareResponseAppModel groupTicketBookingFareResponseAppModel3 = (GroupTicketBookingFareResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    linkedHashMap7.put("groupTicketCategoriesCount", String.valueOf(groupTicketBookingFareResponseAppModel3.c.size()));
                    groupTicketLegSelectionComponent17.O0("gt leg fetch fare success", linkedHashMap7);
                    GroupTicketLegSelectionComponent groupTicketLegSelectionComponent18 = this.this$0;
                    groupTicketLegSelectionComponent18.getClass();
                    groupTicketLegSelectionComponent18.O0("gt leg selection bs triggered", MapsKt.h(new Pair("groupTicketBottomSheetType", "passenger selection type")));
                    arrayList = groupTicketBookingFareResponseAppModel3.c;
                    iG = MapsKt.g(CollectionsKt.v(arrayList, 10));
                    if (iG < 16) {
                        iG = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iG);
                    size = arrayList.size();
                    i2 = 0;
                    while (i2 < size) {
                        Object obj4 = arrayList.get(i2);
                        i2++;
                        GroupTicketCategoryFareDetailsAppModel groupTicketCategoryFareDetailsAppModel3 = (GroupTicketCategoryFareDetailsAppModel) obj4;
                        Pair pair3 = new Pair(groupTicketCategoryFareDetailsAppModel3.f5851a, new GroupTicketPassengerSelectionDataState(groupTicketCategoryFareDetailsAppModel3, false, groupTicketCategoryFareDetailsAppModel3.e, false, false));
                        linkedHashMap.put(pair3.d(), pair3.e());
                    }
                    groupTicketLegSelectionComponent18.E0(new u(26, groupTicketBookingFareResponseAppModel3, list3, GroupTicketLegSelectionComponent.Q0(linkedHashMap, groupTicketBookingFareResponseAppModel3.b)));
                    return unit;
                }
                list2 = list;
                return coroutineSingletons;
            case 6:
                List list6 = (List) this.L$2;
                groupTicketLegSelectionDataState2 = (GroupTicketLegSelectionDataState) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.b(obj);
                list3 = list6;
                chaloUseCaseResult = (ChaloUseCaseResult) obj;
                CoroutineScopeKt.d(coroutineScope2);
                if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                        throw new NoWhenBranchMatchedException();
                    }
                    GroupTicketLegSelectionComponent groupTicketLegSelectionComponent19 = this.this$0;
                    LinkedHashMap linkedHashMap8 = new LinkedHashMap();
                    linkedHashMap8.putAll(GroupTicketLegSelectionComponent.I0(this.this$0, groupTicketLegSelectionDataState2, list3));
                    ProductBookingDataSourceError productBookingDataSourceError4 = (ProductBookingDataSourceError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                    linkedHashMap8.put("error", productBookingDataSourceError4.toString());
                    groupTicketLegSelectionComponent19.O0("gt leg fetch fare failure", linkedHashMap8);
                    GroupTicketLegSelectionComponent groupTicketLegSelectionComponent110 = this.this$0;
                    groupTicketLegSelectionComponent110.getClass();
                    groupTicketLegSelectionComponent110.O0("gt leg selection bs triggered", MapsKt.h(new Pair("groupTicketBottomSheetType", "error type")));
                    groupTicketLegSelectionComponent110.E0(new e40(productBookingDataSourceError4, 3));
                    return unit;
                }
                GroupTicketLegSelectionComponent groupTicketLegSelectionComponent111 = this.this$0;
                LinkedHashMap linkedHashMap9 = new LinkedHashMap();
                linkedHashMap9.putAll(GroupTicketLegSelectionComponent.I0(this.this$0, groupTicketLegSelectionDataState2, list3));
                GroupTicketBookingFareResponseAppModel groupTicketBookingFareResponseAppModel4 = (GroupTicketBookingFareResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                linkedHashMap9.put("groupTicketCategoriesCount", String.valueOf(groupTicketBookingFareResponseAppModel4.c.size()));
                groupTicketLegSelectionComponent111.O0("gt leg fetch fare success", linkedHashMap9);
                GroupTicketLegSelectionComponent groupTicketLegSelectionComponent112 = this.this$0;
                groupTicketLegSelectionComponent112.getClass();
                groupTicketLegSelectionComponent112.O0("gt leg selection bs triggered", MapsKt.h(new Pair("groupTicketBottomSheetType", "passenger selection type")));
                arrayList = groupTicketBookingFareResponseAppModel4.c;
                iG = MapsKt.g(CollectionsKt.v(arrayList, 10));
                if (iG < 16) {
                    iG = 16;
                }
                linkedHashMap = new LinkedHashMap(iG);
                size = arrayList.size();
                i2 = 0;
                while (i2 < size) {
                    Object obj5 = arrayList.get(i2);
                    i2++;
                    GroupTicketCategoryFareDetailsAppModel groupTicketCategoryFareDetailsAppModel4 = (GroupTicketCategoryFareDetailsAppModel) obj5;
                    Pair pair4 = new Pair(groupTicketCategoryFareDetailsAppModel4.f5851a, new GroupTicketPassengerSelectionDataState(groupTicketCategoryFareDetailsAppModel4, false, groupTicketCategoryFareDetailsAppModel4.e, false, false));
                    linkedHashMap.put(pair4.d(), pair4.e());
                }
                groupTicketLegSelectionComponent112.E0(new u(26, groupTicketBookingFareResponseAppModel4, list3, GroupTicketLegSelectionComponent.Q0(linkedHashMap, groupTicketBookingFareResponseAppModel4.b)));
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

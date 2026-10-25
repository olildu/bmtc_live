package app.chalo.usecase;

import app.chalo.constants.Source;
import app.chalo.features.productsync.model.app.BookingHistoryDataAppModel;
import app.chalo.features.productsync.model.app.HistoryResponseAppModel;
import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lapp/chalo/utils/ChaloUseCaseResult;", "", "Lapp/chalo/usecase/ProductHistorySyncErrorType;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2", f = "InitiateProductHistorySyncCallUseCase.kt", l = {244, 255, 259, 263, 267, 271, 278, 282, 290, 303}, m = "invokeSuspend", v = 1)
final class InitiateProductHistorySyncCallUseCase$processProductSyncData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ChaloUseCaseResult<Boolean, ProductHistorySyncErrorType>>, Object> {
    final /* synthetic */ String $city;
    final /* synthetic */ HistoryResponseAppModel $productDataSyncCallResponse;
    final /* synthetic */ Source $source;
    final /* synthetic */ String $userId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

    /* JADX INFO: renamed from: app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$1", f = "InitiateProductHistorySyncCallUseCase.kt", l = {256}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ JsonObject $configurationJsonObject;
        int label;
        final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, JsonObject jsonObject, Continuation continuation) {
            super(1, continuation);
            this.this$0 = initiateProductHistorySyncCallUseCase;
            this.$configurationJsonObject = jsonObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$configurationJsonObject, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass1) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase = this.this$0;
                JsonObject jsonObject = this.$configurationJsonObject;
                this.label = 1;
                if (InitiateProductHistorySyncCallUseCase.f(initiateProductHistorySyncCallUseCase, jsonObject, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$2", f = "InitiateProductHistorySyncCallUseCase.kt", l = {260}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ HistoryResponseAppModel $productDataSyncCallResponse;
        int label;
        final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, HistoryResponseAppModel historyResponseAppModel, Continuation continuation) {
            super(1, continuation);
            this.this$0 = initiateProductHistorySyncCallUseCase;
            this.$productDataSyncCallResponse = historyResponseAppModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$productDataSyncCallResponse, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass2) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase = this.this$0;
            JsonArray jsonArray = this.$productDataSyncCallResponse.b.b;
            this.label = 1;
            Object objB = initiateProductHistorySyncCallUseCase.j.b(jsonArray, this);
            if (objB != coroutineSingletons) {
                objB = unit;
            }
            return objB == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    /* JADX INFO: renamed from: app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$3", f = "InitiateProductHistorySyncCallUseCase.kt", l = {264}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ HistoryResponseAppModel $productDataSyncCallResponse;
        int label;
        final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, HistoryResponseAppModel historyResponseAppModel, Continuation continuation) {
            super(1, continuation);
            this.this$0 = initiateProductHistorySyncCallUseCase;
            this.$productDataSyncCallResponse = historyResponseAppModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass3(this.this$0, this.$productDataSyncCallResponse, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass3) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase = this.this$0;
            JsonArray jsonArray = this.$productDataSyncCallResponse.b.c;
            this.label = 1;
            Object objA = initiateProductHistorySyncCallUseCase.j.a(jsonArray, this);
            if (objA != coroutineSingletons) {
                objA = unit;
            }
            return objA == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    /* JADX INFO: renamed from: app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$4", f = "InitiateProductHistorySyncCallUseCase.kt", l = {268}, m = "invokeSuspend", v = 1)
    final class AnonymousClass4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ HistoryResponseAppModel $productDataSyncCallResponse;
        int label;
        final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, HistoryResponseAppModel historyResponseAppModel, Continuation continuation) {
            super(1, continuation);
            this.this$0 = initiateProductHistorySyncCallUseCase;
            this.$productDataSyncCallResponse = historyResponseAppModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass4(this.this$0, this.$productDataSyncCallResponse, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass4) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase = this.this$0;
            JsonArray jsonArray = this.$productDataSyncCallResponse.b.f2752a;
            this.label = 1;
            Object objD = initiateProductHistorySyncCallUseCase.j.d(jsonArray, this);
            if (objD != coroutineSingletons) {
                objD = unit;
            }
            return objD == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    /* JADX INFO: renamed from: app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$5", f = "InitiateProductHistorySyncCallUseCase.kt", l = {272}, m = "invokeSuspend", v = 1)
    final class AnonymousClass5 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ HistoryResponseAppModel $productDataSyncCallResponse;
        int label;
        final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, HistoryResponseAppModel historyResponseAppModel, Continuation continuation) {
            super(1, continuation);
            this.this$0 = initiateProductHistorySyncCallUseCase;
            this.$productDataSyncCallResponse = historyResponseAppModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass5(this.this$0, this.$productDataSyncCallResponse, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass5) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase = this.this$0;
                BookingHistoryDataAppModel bookingHistoryDataAppModel = this.$productDataSyncCallResponse.b;
                JsonArray jsonArray = bookingHistoryDataAppModel.h;
                JsonArray jsonArray2 = bookingHistoryDataAppModel.g;
                this.label = 1;
                if (InitiateProductHistorySyncCallUseCase.g(initiateProductHistorySyncCallUseCase, jsonArray, jsonArray2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$6", f = "InitiateProductHistorySyncCallUseCase.kt", l = {279}, m = "invokeSuspend", v = 1)
    final class AnonymousClass6 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ HistoryResponseAppModel $productDataSyncCallResponse;
        int label;
        final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, HistoryResponseAppModel historyResponseAppModel, Continuation continuation) {
            super(1, continuation);
            this.this$0 = initiateProductHistorySyncCallUseCase;
            this.$productDataSyncCallResponse = historyResponseAppModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass6(this.this$0, this.$productDataSyncCallResponse, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass6) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
            InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase = this.this$0;
            JsonArray jsonArray = this.$productDataSyncCallResponse.b.e;
            this.label = 1;
            Object objC = initiateProductHistorySyncCallUseCase.j.c(jsonArray, this);
            if (objC != coroutineSingletons) {
                objC = unit;
            }
            return objC == coroutineSingletons ? coroutineSingletons : unit;
        }
    }

    /* JADX INFO: renamed from: app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$7", f = "InitiateProductHistorySyncCallUseCase.kt", l = {283}, m = "invokeSuspend", v = 1)
    final class AnonymousClass7 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ String $city;
        final /* synthetic */ HistoryResponseAppModel $productDataSyncCallResponse;
        final /* synthetic */ String $userId;
        int label;
        final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, HistoryResponseAppModel historyResponseAppModel, String str, String str2, Continuation continuation) {
            super(1, continuation);
            this.this$0 = initiateProductHistorySyncCallUseCase;
            this.$productDataSyncCallResponse = historyResponseAppModel;
            this.$userId = str;
            this.$city = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass7(this.this$0, this.$productDataSyncCallResponse, this.$userId, this.$city, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass7) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase = this.this$0;
                HistoryResponseAppModel historyResponseAppModel = this.$productDataSyncCallResponse;
                JsonArray jsonArray = historyResponseAppModel.b.d;
                String str = historyResponseAppModel.c;
                if (str.length() <= 0) {
                    str = null;
                }
                if (str == null) {
                    str = this.$userId;
                }
                String str2 = this.$city;
                this.label = 1;
                if (InitiateProductHistorySyncCallUseCase.d(initiateProductHistorySyncCallUseCase, jsonArray, str, str2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: renamed from: app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$8, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2$8", f = "InitiateProductHistorySyncCallUseCase.kt", l = {291}, m = "invokeSuspend", v = 1)
    final class AnonymousClass8 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
        final /* synthetic */ HistoryResponseAppModel $productDataSyncCallResponse;
        final /* synthetic */ String $userId;
        int label;
        final /* synthetic */ InitiateProductHistorySyncCallUseCase this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass8(InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, HistoryResponseAppModel historyResponseAppModel, String str, Continuation continuation) {
            super(1, continuation);
            this.this$0 = initiateProductHistorySyncCallUseCase;
            this.$productDataSyncCallResponse = historyResponseAppModel;
            this.$userId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new AnonymousClass8(this.this$0, this.$productDataSyncCallResponse, this.$userId, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((AnonymousClass8) create((Continuation) obj)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase = this.this$0;
                boolean z = this.$productDataSyncCallResponse.f2753a.f2754a;
                String strB = CityProviderKt.b(initiateProductHistorySyncCallUseCase.e);
                String str = this.$userId;
                this.label = 1;
                if (InitiateProductHistorySyncCallUseCase.e(initiateProductHistorySyncCallUseCase, z, strB, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitiateProductHistorySyncCallUseCase$processProductSyncData$2(HistoryResponseAppModel historyResponseAppModel, InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, Source source, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$productDataSyncCallResponse = historyResponseAppModel;
        this.this$0 = initiateProductHistorySyncCallUseCase;
        this.$source = source;
        this.$userId = str;
        this.$city = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InitiateProductHistorySyncCallUseCase$processProductSyncData$2(this.$productDataSyncCallResponse, this.this$0, this.$source, this.$userId, this.$city, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InitiateProductHistorySyncCallUseCase$processProductSyncData$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d2 A[PHI: r1
      0x00d2: PHI (r1v11 java.util.List) = (r1v8 java.util.List), (r1v13 java.util.List) binds: [B:28:0x00ce, B:13:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00ea A[PHI: r1
      0x00ea: PHI (r1v14 java.util.List) = (r1v11 java.util.List), (r1v16 java.util.List) binds: [B:31:0x00e6, B:12:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:36:0x0102 A[PHI: r1
      0x0102: PHI (r1v17 java.util.List) = (r1v14 java.util.List), (r1v19 java.util.List) binds: [B:34:0x00fe, B:11:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x011b A[PHI: r1
      0x011b: PHI (r1v20 java.util.List) = (r1v17 java.util.List), (r1v22 java.util.List) binds: [B:37:0x0117, B:10:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0133 A[PHI: r1
      0x0133: PHI (r1v23 java.util.List) = (r1v20 java.util.List), (r1v25 java.util.List) binds: [B:40:0x012f, B:9:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x0151 A[PHI: r1
      0x0151: PHI (r1v26 java.util.List) = (r1v23 java.util.List), (r1v28 java.util.List) binds: [B:43:0x014d, B:8:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:48:0x016d A[PHI: r1
      0x016d: PHI (r1v29 java.util.List) = (r1v26 java.util.List), (r1v32 java.util.List) binds: [B:46:0x0169, B:7:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x017f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0195  */
    /* JADX WARN: Code duplicated, block: B:58:0x0198  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fd A[LOOP:1: B:79:0x01f7->B:81:0x01fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x0240  */
    /* JADX WARN: Code duplicated, block: B:89:0x0257  */
    /* JADX WARN: Code duplicated, block: B:91:0x018f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x01c1 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x024c, code lost:
    
        if (r13.a(true, r12) == r0) goto L86;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.usecase.InitiateProductHistorySyncCallUseCase$processProductSyncData$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

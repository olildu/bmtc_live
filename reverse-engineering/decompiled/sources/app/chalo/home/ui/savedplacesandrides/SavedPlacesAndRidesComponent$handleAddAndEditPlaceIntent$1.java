package app.chalo.home.ui.savedplacesandrides;

import app.chalo.constants.Source;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.args.UniversalPickerArgs;
import app.chalo.scenes.args.UniversalPickerHeaderIcon;
import app.chalo.universalsearch.data.UniversalSearchFlowSource;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceTag;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1", f = "SavedPlacesAndRidesComponent.kt", l = {}, m = "invokeSuspend", v = 1)
final class SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SavedPlacesAndRidesIntent.AddAndEditPlaceIntent $intent;
    final /* synthetic */ String $requestId;
    final /* synthetic */ String $searchOptionsJson;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SavedPlacesAndRidesComponent this$0;

    /* JADX INFO: renamed from: app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1$1", f = "SavedPlacesAndRidesComponent.kt", l = {205}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SavedPlacesAndRidesIntent.AddAndEditPlaceIntent $intent;
        final /* synthetic */ String $requestId;
        int label;
        final /* synthetic */ SavedPlacesAndRidesComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SavedPlacesAndRidesComponent savedPlacesAndRidesComponent, String str, SavedPlacesAndRidesIntent.AddAndEditPlaceIntent addAndEditPlaceIntent, Continuation continuation) {
            super(2, continuation);
            this.this$0 = savedPlacesAndRidesComponent;
            this.$requestId = str;
            this.$intent = addAndEditPlaceIntent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$requestId, this.$intent, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Unit unit = Unit.f17538a;
            if (i == 0) {
                ResultKt.b(obj);
                SavedPlacesAndRidesComponent savedPlacesAndRidesComponent = this.this$0;
                String str = this.$requestId;
                UserCommutePreferenceTag userCommutePreferenceTag = this.$intent.f3681a;
                this.label = 1;
                savedPlacesAndRidesComponent.getClass();
                Object objC = CoroutineScopeKt.c(new SavedPlacesAndRidesComponent$collectUniversalSearchResult$2(savedPlacesAndRidesComponent, str, userCommutePreferenceTag, null), this);
                if (objC != coroutineSingletons) {
                    objC = unit;
                }
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return unit;
        }
    }

    /* JADX INFO: renamed from: app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1$2", f = "SavedPlacesAndRidesComponent.kt", l = {216}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $requestId;
        final /* synthetic */ String $searchOptionsJson;
        Object L$0;
        int label;
        final /* synthetic */ SavedPlacesAndRidesComponent this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SavedPlacesAndRidesComponent savedPlacesAndRidesComponent, String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.this$0 = savedPlacesAndRidesComponent;
            this.$searchOptionsJson = str;
            this.$requestId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$searchOptionsJson, this.$requestId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ChaloNavigationManager chaloNavigationManager;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                SavedPlacesAndRidesComponent savedPlacesAndRidesComponent = this.this$0;
                ChaloNavigationManager chaloNavigationManager2 = savedPlacesAndRidesComponent.p;
                this.L$0 = chaloNavigationManager2;
                this.label = 1;
                obj = savedPlacesAndRidesComponent.q.b(StringEnum.ENTER_LOCATION, new Object[0], this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                chaloNavigationManager = chaloNavigationManager2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                chaloNavigationManager = (ChaloNavigationManager) this.L$0;
                ResultKt.b(obj);
            }
            Source source = Source.SAVED_PLACES_AND_RIDES_SCREEN;
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new UniversalPickerArgs(this.$searchOptionsJson, (String) obj, UniversalSearchFlowSource.HOME_WORK_SELECTION.getSourceName(), source, (String) null, "ACTIVITY_RESULT", this.$requestId, (ChaloTransitMode) null, (String) null, (String) null, (UniversalPickerHeaderIcon) null, 1936), null, null, 6));
            return Unit.f17538a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1(SavedPlacesAndRidesComponent savedPlacesAndRidesComponent, String str, SavedPlacesAndRidesIntent.AddAndEditPlaceIntent addAndEditPlaceIntent, String str2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = savedPlacesAndRidesComponent;
        this.$requestId = str;
        this.$intent = addAndEditPlaceIntent;
        this.$searchOptionsJson = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1 savedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1 = new SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1(this.this$0, this.$requestId, this.$intent, this.$searchOptionsJson, continuation);
        savedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1.L$0 = obj;
        return savedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1 savedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1 = (SavedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        savedPlacesAndRidesComponent$handleAddAndEditPlaceIntent$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass1(this.this$0, this.$requestId, this.$intent, null), 3);
        BuildersKt.d(coroutineScope, null, null, new AnonymousClass2(this.this$0, this.$searchOptionsJson, this.$requestId, null), 3);
        return Unit.f17538a;
    }
}

package app.chalo.home.ui.savedplacesandrides;

import app.chalo.network.config.ChaloJson;
import app.chalo.recent.model.app.RecentPlaceAppModel;
import app.chalo.resultstatemanager.ResultStateData;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultState;
import app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceTag;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.json.Json;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent$collectUniversalSearchResult$2", f = "SavedPlacesAndRidesComponent.kt", l = {232}, m = "invokeSuspend", v = 1)
final class SavedPlacesAndRidesComponent$collectUniversalSearchResult$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $requestId;
    final /* synthetic */ UserCommutePreferenceTag $userCommutePreferenceTag;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SavedPlacesAndRidesComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedPlacesAndRidesComponent$collectUniversalSearchResult$2(SavedPlacesAndRidesComponent savedPlacesAndRidesComponent, String str, UserCommutePreferenceTag userCommutePreferenceTag, Continuation continuation) {
        super(2, continuation);
        this.this$0 = savedPlacesAndRidesComponent;
        this.$requestId = str;
        this.$userCommutePreferenceTag = userCommutePreferenceTag;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SavedPlacesAndRidesComponent$collectUniversalSearchResult$2 savedPlacesAndRidesComponent$collectUniversalSearchResult$2 = new SavedPlacesAndRidesComponent$collectUniversalSearchResult$2(this.this$0, this.$requestId, this.$userCommutePreferenceTag, continuation);
        savedPlacesAndRidesComponent$collectUniversalSearchResult$2.L$0 = obj;
        return savedPlacesAndRidesComponent$collectUniversalSearchResult$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SavedPlacesAndRidesComponent$collectUniversalSearchResult$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Object objB;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            SavedPlacesAndRidesComponent savedPlacesAndRidesComponent = this.this$0;
            Flow flowB = savedPlacesAndRidesComponent.r.b(this.$requestId);
            this.L$0 = coroutineScope2;
            this.label = 1;
            Object objV = savedPlacesAndRidesComponent.b.v(flowB, this);
            if (objV == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
            obj = objV;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.b(obj);
        }
        ResultStateData resultStateData = (ResultStateData) obj;
        CoroutineScopeKt.d(coroutineScope);
        if (!(resultStateData instanceof ResultStateData.Cancelled)) {
            if (!(resultStateData instanceof ResultStateData.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((UniversalSearchResultState) ((ResultStateData.Success) resultStateData).f9039a).b;
            if (str != null && str.length() != 0) {
                try {
                    Json json = ChaloJson.b;
                    json.getClass();
                    objB = json.b(str, RecentPlaceAppModel.INSTANCE.serializer());
                } catch (Exception unused) {
                    objB = null;
                }
                RecentPlaceAppModel recentPlaceAppModel = (RecentPlaceAppModel) objB;
                if (recentPlaceAppModel != null) {
                    this.this$0.I0(new SavedPlacesAndRidesIntent.PlaceSelectionFieldResultIntent(this.$userCommutePreferenceTag, recentPlaceAppModel));
                }
            }
        }
        return Unit.f17538a;
    }
}

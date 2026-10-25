package app.chalo.premiumbus.ui.seatselection;

import app.chalo.login.manager.UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1;
import app.chalo.premiumbus.data.GenderPreferenceSelectionStates;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapperImpl$getGenderPreferenceSelectionState$$inlined$map$1;
import app.chalo.userprofile.Gender;
import app.chalo.userprofile.UserProfileAppModel;
import defpackage.mf;
import defpackage.vu0;
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
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionComponent$handleInitialisationIntent$1", f = "PremiumBusSeatSelectionComponent.kt", l = {1007, 1009, 1018}, m = "invokeSuspend", v = 1)
final class PremiumBusSeatSelectionComponent$handleInitialisationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PremiumBusSeatSelectionIntent.InitializationIntent $intent;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ PremiumBusSeatSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBusSeatSelectionComponent$handleInitialisationIntent$1(PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent, PremiumBusSeatSelectionIntent.InitializationIntent initializationIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = premiumBusSeatSelectionComponent;
        this.$intent = initializationIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PremiumBusSeatSelectionComponent$handleInitialisationIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PremiumBusSeatSelectionComponent$handleInitialisationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        UserProfileAppModel userProfileAppModel;
        Gender gender;
        boolean zK0;
        boolean z;
        Gender gender2;
        GenderPreferenceSelectionStates genderPreferenceSelectionStates;
        String str;
        boolean z2;
        String str2;
        Job job;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            this.this$0.E0(new vu0(0));
            UserProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1 userProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1E = this.this$0.u.e();
            this.label = 1;
            obj = FlowKt.v(userProfileDetailsProviderImpl$getUserProfileDetailsAsFlow$$inlined$map$1E, this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                UserProfileAppModel userProfileAppModel2 = (UserProfileAppModel) this.L$0;
                ResultKt.b(obj);
                userProfileAppModel = userProfileAppModel2;
                gender = (Gender) obj;
                zK0 = PremiumBusSeatSelectionComponent.K0(this.this$0, this.$intent.b);
                if (!zK0 && userProfileAppModel != null && (str = userProfileAppModel.i) != null) {
                    PremiumBusDataStoreWrapperImpl$getGenderPreferenceSelectionState$$inlined$map$1 premiumBusDataStoreWrapperImpl$getGenderPreferenceSelectionState$$inlined$map$1J = this.this$0.v.j(str);
                    this.L$0 = userProfileAppModel;
                    this.L$1 = gender;
                    this.Z$0 = zK0;
                    this.label = 3;
                    Object objV = FlowKt.v(premiumBusDataStoreWrapperImpl$getGenderPreferenceSelectionState$$inlined$map$1J, this);
                    if (objV != coroutineSingletons) {
                        z2 = zK0;
                        obj = objV;
                    }
                    return coroutineSingletons;
                }
                z = zK0;
                gender2 = gender;
                genderPreferenceSelectionStates = null;
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent = this.this$0;
                premiumBusSeatSelectionComponent.E0(new mf(this.$intent, z, premiumBusSeatSelectionComponent, gender2, genderPreferenceSelectionStates, 3));
                if (PremiumBusSeatSelectionComponent.K0(this.this$0, this.$intent.b) && userProfileAppModel != null && (str2 = userProfileAppModel.i) != null) {
                    PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent2 = this.this$0;
                    job = premiumBusSeatSelectionComponent2.D;
                    if (job != null) {
                        ((JobSupport) job).cancel(null);
                    }
                    premiumBusSeatSelectionComponent2.D = BuildersKt.d(premiumBusSeatSelectionComponent2.j, null, null, new PremiumBusSeatSelectionComponent$startCollectingGenderPreferenceSelectionState$1(premiumBusSeatSelectionComponent2, str2, null), 3);
                }
                PremiumBusSeatSelectionComponent.I0(this.this$0, this.$intent.b);
                return Unit.f17538a;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = this.Z$0;
            gender = (Gender) this.L$1;
            userProfileAppModel = (UserProfileAppModel) this.L$0;
            ResultKt.b(obj);
        }
        genderPreferenceSelectionStates = (GenderPreferenceSelectionStates) obj;
        z = z2;
        gender2 = gender;
        PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent3 = this.this$0;
        premiumBusSeatSelectionComponent3.E0(new mf(this.$intent, z, premiumBusSeatSelectionComponent3, gender2, genderPreferenceSelectionStates, 3));
        if (PremiumBusSeatSelectionComponent.K0(this.this$0, this.$intent.b)) {
            PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent4 = this.this$0;
            job = premiumBusSeatSelectionComponent4.D;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            premiumBusSeatSelectionComponent4.D = BuildersKt.d(premiumBusSeatSelectionComponent4.j, null, null, new PremiumBusSeatSelectionComponent$startCollectingGenderPreferenceSelectionState$1(premiumBusSeatSelectionComponent4, str2, null), 3);
        }
        PremiumBusSeatSelectionComponent.I0(this.this$0, this.$intent.b);
        return Unit.f17538a;
        UserProfileAppModel userProfileAppModel3 = (UserProfileAppModel) obj;
        PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent5 = this.this$0;
        this.L$0 = userProfileAppModel3;
        this.label = 2;
        Enum enumJ0 = PremiumBusSeatSelectionComponent.J0(premiumBusSeatSelectionComponent5, this);
        if (enumJ0 != coroutineSingletons) {
            userProfileAppModel = userProfileAppModel3;
            obj = enumJ0;
            gender = (Gender) obj;
            zK0 = PremiumBusSeatSelectionComponent.K0(this.this$0, this.$intent.b);
            if (!zK0) {
            }
            z = zK0;
            gender2 = gender;
            genderPreferenceSelectionStates = null;
            PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent6 = this.this$0;
            premiumBusSeatSelectionComponent6.E0(new mf(this.$intent, z, premiumBusSeatSelectionComponent6, gender2, genderPreferenceSelectionStates, 3));
            if (PremiumBusSeatSelectionComponent.K0(this.this$0, this.$intent.b)) {
                PremiumBusSeatSelectionComponent premiumBusSeatSelectionComponent7 = this.this$0;
                job = premiumBusSeatSelectionComponent7.D;
                if (job != null) {
                    ((JobSupport) job).cancel(null);
                }
                premiumBusSeatSelectionComponent7.D = BuildersKt.d(premiumBusSeatSelectionComponent7.j, null, null, new PremiumBusSeatSelectionComponent$startCollectingGenderPreferenceSelectionState$1(premiumBusSeatSelectionComponent7, str2, null), 3);
            }
            PremiumBusSeatSelectionComponent.I0(this.this$0, this.$intent.b);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }
}

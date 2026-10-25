package app.chalo.home.ui.savedplacesandrides;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent$handleConfirmationDialogPositiveBtnClickIntent$2", f = "SavedPlacesAndRidesComponent.kt", l = {259, 260}, m = "invokeSuspend", v = 1)
final class SavedPlacesAndRidesComponent$handleConfirmationDialogPositiveBtnClickIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ ConfirmationDialogType $dialogType;
    int label;
    final /* synthetic */ SavedPlacesAndRidesComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavedPlacesAndRidesComponent$handleConfirmationDialogPositiveBtnClickIntent$2(ConfirmationDialogType confirmationDialogType, SavedPlacesAndRidesComponent savedPlacesAndRidesComponent, Continuation continuation) {
        super(2, continuation);
        this.$dialogType = confirmationDialogType;
        this.this$0 = savedPlacesAndRidesComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SavedPlacesAndRidesComponent$handleConfirmationDialogPositiveBtnClickIntent$2(this.$dialogType, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SavedPlacesAndRidesComponent$handleConfirmationDialogPositiveBtnClickIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        if (app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent.F0(r1, r5, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent.G0(r1, r5, r4) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L19
            if (r1 == r3) goto L15
            if (r1 != r2) goto Ld
            goto L15
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            kotlin.ResultKt.b(r5)
            goto L46
        L19:
            kotlin.ResultKt.b(r5)
            app.chalo.home.ui.savedplacesandrides.ConfirmationDialogType r5 = r4.$dialogType
            boolean r1 = r5 instanceof app.chalo.home.ui.savedplacesandrides.ConfirmationDialogType.Place
            if (r1 == 0) goto L31
            app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent r1 = r4.this$0
            app.chalo.home.ui.savedplacesandrides.ConfirmationDialogType$Place r5 = (app.chalo.home.ui.savedplacesandrides.ConfirmationDialogType.Place) r5
            app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceStopPlaceAppModel r5 = r5.f3671a
            r4.label = r3
            java.lang.Object r5 = app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent.F0(r1, r5, r4)
            if (r5 != r0) goto L46
            goto L43
        L31:
            boolean r1 = r5 instanceof app.chalo.home.ui.savedplacesandrides.ConfirmationDialogType.Ride
            if (r1 == 0) goto L44
            app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent r1 = r4.this$0
            app.chalo.home.ui.savedplacesandrides.ConfirmationDialogType$Ride r5 = (app.chalo.home.ui.savedplacesandrides.ConfirmationDialogType.Ride) r5
            app.chalo.usercommutepreference.data.models.app.UserCommutePreferenceSavedRideAppModel r5 = r5.f3672a
            r4.label = r2
            java.lang.Object r5 = app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent.G0(r1, r5, r4)
            if (r5 != r0) goto L46
        L43:
            return r0
        L44:
            if (r5 != 0) goto L49
        L46:
            kotlin.Unit r5 = kotlin.Unit.f17538a
            return r5
        L49:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.home.ui.savedplacesandrides.SavedPlacesAndRidesComponent$handleConfirmationDialogPositiveBtnClickIntent$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

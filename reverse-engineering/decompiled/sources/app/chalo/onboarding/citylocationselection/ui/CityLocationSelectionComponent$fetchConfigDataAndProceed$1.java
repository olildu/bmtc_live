package app.chalo.onboarding.citylocationselection.ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$fetchConfigDataAndProceed$1", f = "CityLocationSelectionComponent.kt", l = {365, 379, 399, 434, 435, 454}, m = "invokeSuspend", v = 1)
final class CityLocationSelectionComponent$fetchConfigDataAndProceed$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $cityDisplayName;
    final /* synthetic */ String $cityId;
    final /* synthetic */ long $minLoaderEndTime;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CityLocationSelectionComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CityLocationSelectionComponent$fetchConfigDataAndProceed$1(CityLocationSelectionComponent cityLocationSelectionComponent, String str, String str2, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cityLocationSelectionComponent;
        this.$cityId = str;
        this.$cityDisplayName = str2;
        this.$minLoaderEndTime = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CityLocationSelectionComponent$fetchConfigDataAndProceed$1 cityLocationSelectionComponent$fetchConfigDataAndProceed$1 = new CityLocationSelectionComponent$fetchConfigDataAndProceed$1(this.this$0, this.$cityId, this.$cityDisplayName, this.$minLoaderEndTime, continuation);
        cityLocationSelectionComponent$fetchConfigDataAndProceed$1.L$0 = obj;
        return cityLocationSelectionComponent$fetchConfigDataAndProceed$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CityLocationSelectionComponent$fetchConfigDataAndProceed$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX WARN: Code duplicated, block: B:21:0x0089  */
    /* JADX WARN: Code duplicated, block: B:22:0x0093  */
    /* JADX WARN: Code duplicated, block: B:32:0x00da A[PHI: r2 r9
      0x00da: PHI (r2v10 kotlinx.coroutines.CoroutineScope) = (r2v6 kotlinx.coroutines.CoroutineScope), (r2v14 kotlinx.coroutines.CoroutineScope) binds: [B:30:0x00d6, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x00da: PHI (r9v22 java.lang.Object) = (r9v15 java.lang.Object), (r9v27 java.lang.Object) binds: [B:30:0x00d6, B:10:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x010e  */
    /* JADX WARN: Code duplicated, block: B:36:0x011b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0141 A[PHI: r2 r3
      0x0141: PHI (r2v15 kotlinx.coroutines.Deferred) = (r2v11 kotlinx.coroutines.Deferred), (r2v18 kotlinx.coroutines.Deferred) binds: [B:37:0x013d, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]
      0x0141: PHI (r3v3 java.lang.Object) = (r3v1 java.lang.Object), (r3v5 java.lang.Object) binds: [B:37:0x013d, B:9:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0150 A[PHI: r2 r3
      0x0150: PHI (r2v19 java.lang.Object) = (r2v16 java.lang.Object), (r2v58 java.lang.Object) binds: [B:40:0x014c, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]
      0x0150: PHI (r3v6 app.chalo.utils.ChaloUseCaseResult) = (r3v4 app.chalo.utils.ChaloUseCaseResult), (r3v21 app.chalo.utils.ChaloUseCaseResult) binds: [B:40:0x014c, B:8:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0156  */
    /* JADX WARN: Code duplicated, block: B:46:0x015a  */
    /* JADX WARN: Code duplicated, block: B:48:0x015e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0168  */
    /* JADX WARN: Code duplicated, block: B:52:0x0178  */
    /* JADX WARN: Code duplicated, block: B:56:0x018b  */
    /* JADX WARN: Code duplicated, block: B:58:0x019c  */
    /* JADX WARN: Code duplicated, block: B:60:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:70:0x01da  */
    /* JADX WARN: Code duplicated, block: B:72:0x01de  */
    /* JADX WARN: Code duplicated, block: B:74:0x0241  */
    /* JADX WARN: Code duplicated, block: B:75:0x024d  */
    /* JADX WARN: Code duplicated, block: B:77:0x025b  */
    /* JADX WARN: Code duplicated, block: B:78:0x025e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0265  */
    /* JADX WARN: Code duplicated, block: B:84:0x026c  */
    /* JADX WARN: Code duplicated, block: B:85:0x026e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0272  */
    /* JADX WARN: Code duplicated, block: B:91:0x0290  */
    /* JADX WARN: Code duplicated, block: B:95:0x0297 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x0298 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:97:0x0299  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
    
        if (r9 == r1) goto L95;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x00da, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 690
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent$fetchConfigDataAndProceed$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

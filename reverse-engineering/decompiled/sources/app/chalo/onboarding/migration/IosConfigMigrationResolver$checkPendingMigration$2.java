package app.chalo.onboarding.migration;

import androidx.datastore.preferences.core.Preferences;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/onboarding/migration/IosMigrationRequirement;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.migration.IosConfigMigrationResolver$checkPendingMigration$2", f = "IosConfigMigrationResolver.kt", l = {65}, m = "invokeSuspend", v = 1)
final class IosConfigMigrationResolver$checkPendingMigration$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends IosMigrationRequirement>>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ IosConfigMigrationResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IosConfigMigrationResolver$checkPendingMigration$2(IosConfigMigrationResolver iosConfigMigrationResolver, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iosConfigMigrationResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        IosConfigMigrationResolver$checkPendingMigration$2 iosConfigMigrationResolver$checkPendingMigration$2 = new IosConfigMigrationResolver$checkPendingMigration$2(this.this$0, continuation);
        iosConfigMigrationResolver$checkPendingMigration$2.L$0 = obj;
        return iosConfigMigrationResolver$checkPendingMigration$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IosConfigMigrationResolver$checkPendingMigration$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            IosConfigMigrationResolver iosConfigMigrationResolver = this.this$0;
            Preferences.Key key = IosConfigMigrationResolver.f6679a;
            iosConfigMigrationResolver.getClass();
            Deferred deferredB = BuildersKt.b(coroutineScope, null, null, new IosConfigMigrationResolver$requireRemoteConfigFetch$1(iosConfigMigrationResolver, null), 3);
            IosConfigMigrationResolver iosConfigMigrationResolver2 = this.this$0;
            iosConfigMigrationResolver2.getClass();
            Deferred deferredB2 = BuildersKt.b(coroutineScope, null, null, new IosConfigMigrationResolver$requireHomeScreenConfigFetch$1(iosConfigMigrationResolver2, null), 3);
            IosConfigMigrationResolver iosConfigMigrationResolver3 = this.this$0;
            iosConfigMigrationResolver3.getClass();
            List listS = CollectionsKt.S(deferredB, deferredB2, BuildersKt.b(coroutineScope, null, null, new IosConfigMigrationResolver$requireHistoryCallFetch$1(iosConfigMigrationResolver3, null), 3));
            this.label = 1;
            obj = AwaitKt.a(listS, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Pair pair : (List) obj) {
            IosMigrationRequirement iosMigrationRequirement = (IosMigrationRequirement) pair.getFirst();
            if (!((Boolean) pair.getSecond()).booleanValue()) {
                iosMigrationRequirement = null;
            }
            if (iosMigrationRequirement != null) {
                arrayList.add(iosMigrationRequirement);
            }
        }
        return CollectionsKt.z(arrayList);
    }
}

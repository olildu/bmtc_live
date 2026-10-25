package app.chalo.onboarding.migration;

import androidx.datastore.preferences.core.Preferences;
import app.chalo.extensions.DataStoreExtensionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lapp/chalo/onboarding/migration/IosMigrationRequirement;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.onboarding.migration.IosConfigMigrationResolver$requireRemoteConfigFetch$1", f = "IosConfigMigrationResolver.kt", l = {79, 84, 88}, m = "invokeSuspend", v = 1)
final class IosConfigMigrationResolver$requireRemoteConfigFetch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Pair<? extends IosMigrationRequirement, ? extends Boolean>>, Object> {
    int label;
    final /* synthetic */ IosConfigMigrationResolver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IosConfigMigrationResolver$requireRemoteConfigFetch$1(IosConfigMigrationResolver iosConfigMigrationResolver, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iosConfigMigrationResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IosConfigMigrationResolver$requireRemoteConfigFetch$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((IosConfigMigrationResolver$requireRemoteConfigFetch$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            IosConfigMigrationResolver iosConfigMigrationResolver = this.this$0;
            Preferences.Key key = IosConfigMigrationResolver.f6679a;
            iosConfigMigrationResolver.getClass();
            throw null;
        }
        if (i == 1) {
            ResultKt.b(obj);
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                return new Pair(IosMigrationRequirement.CHALO_CONFIG, bool);
            }
            IosConfigMigrationResolver iosConfigMigrationResolver2 = this.this$0;
            Preferences.Key key2 = IosConfigMigrationResolver.f6679a;
            iosConfigMigrationResolver2.getClass();
            throw null;
        }
        if (i == 2) {
            ResultKt.b(obj);
            Boolean bool2 = (Boolean) obj;
            if (bool2 != null ? bool2.booleanValue() : false) {
                return new Pair(IosMigrationRequirement.CHALO_CONFIG, Boolean.TRUE);
            }
            IosConfigMigrationResolver iosConfigMigrationResolver3 = this.this$0;
            Preferences.Key key3 = IosConfigMigrationResolver.f6679a;
            iosConfigMigrationResolver3.getClass();
            Preferences.Key key4 = IosConfigMigrationResolver.f6679a;
            Boolean bool3 = Boolean.FALSE;
            this.label = 3;
            if (DataStoreExtensionsKt.b(null, key4, bool3, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return new Pair(IosMigrationRequirement.CHALO_CONFIG, Boolean.FALSE);
    }
}

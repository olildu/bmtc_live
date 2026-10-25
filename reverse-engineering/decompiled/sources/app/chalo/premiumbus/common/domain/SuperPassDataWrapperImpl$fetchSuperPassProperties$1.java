package app.chalo.premiumbus.common.domain;

import androidx.compose.ui.spatial.RectListKt;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.data.SuperPassPropertiesAppModel;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.models.entities.SuperPassSubType;
import app.chalo.superpass.data.repository.SuperPassRepository;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.premiumbus.common.domain.SuperPassDataWrapperImpl", f = "SuperPassDataWrapperImpl.kt", l = {EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION, RectListKt.BitOffsetForGesturable}, m = "fetchSuperPassProperties", v = 1)
final class SuperPassDataWrapperImpl$fetchSuperPassProperties$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SuperPassDataWrapperImpl this$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        SuperPassRepository superPassRepository = this.this$0.f6942a;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            ResultKt.b(obj);
            int[] iArr = SuperPassDataWrapperImpl.WhenMappings.f6943a;
            throw null;
        }
        if (i2 != 1 && i2 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        SuperPass superPass = (SuperPass) obj;
        if (superPass == null) {
            return null;
        }
        SuperPassProperties superPassProperties = superPass.f9560a;
        Intrinsics.i(superPassProperties, "<this>");
        String str = superPassProperties.f9566a;
        String str2 = superPassProperties.b;
        SuperPassSubTypes.Companion companion = SuperPassSubTypes.INSTANCE;
        SuperPassSubType.Companion companion2 = SuperPassSubType.INSTANCE;
        SuperPassSubType superPassSubType = superPassProperties.c;
        companion2.getClass();
        String strB = SuperPassSubType.Companion.b(superPassSubType);
        companion.getClass();
        return new SuperPassPropertiesAppModel(str, str2, SuperPassSubTypes.Companion.a(strB), superPassProperties.d, superPassProperties.e, superPassProperties.f, superPassProperties.g);
    }
}

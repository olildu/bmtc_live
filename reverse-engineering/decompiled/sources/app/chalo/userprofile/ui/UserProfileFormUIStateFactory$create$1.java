package app.chalo.userprofile.ui;

import androidx.media3.extractor.ts.TsExtractor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.bouncycastle.asn1.eac.EACTags;
import org.npci.upi.security.pinactivitycomponent.CLConstants;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.ui.UserProfileFormUIStateFactory", f = "UserProfileFormUIStateFactory.kt", l = {EACTags.HISTORICAL_BYTES, 88, 97, 99, FacebookMediationAdapter.ERROR_FAILED_TO_PRESENT_AD, 112, 122, 124, TsExtractor.TS_STREAM_TYPE_DTS, 140, 152, TsExtractor.TS_STREAM_TYPE_AC4, 197}, m = CLConstants.CRED_SUB_TYPE_MANDATE_CREATE, v = 1)
final class UserProfileFormUIStateFactory$create$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserProfileFormUIStateFactory this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileFormUIStateFactory$create$1(UserProfileFormUIStateFactory userProfileFormUIStateFactory, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = userProfileFormUIStateFactory;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}

package app.chalo.login.ui.otp;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.wallet.WalletConstants;
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
@DebugMetadata(c = "app.chalo.login.ui.otp.LoginOtpEnterComponent$handleOnVerifyClickedIntent$1", f = "LoginOtpEnterComponent.kt", l = {361, 363, 381, 395, WalletConstants.ERROR_CODE_AUTHENTICATION_FAILURE, TypedValues.CycleType.TYPE_WAVE_PERIOD}, m = "invokeSuspend", v = 1)
final class LoginOtpEnterComponent$handleOnVerifyClickedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $countryCode;
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ String $refNo;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoginOtpEnterComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginOtpEnterComponent$handleOnVerifyClickedIntent$1(LoginOtpEnterComponent loginOtpEnterComponent, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.$phoneNumber = str;
        this.$countryCode = str2;
        this.$refNo = str3;
        this.this$0 = loginOtpEnterComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LoginOtpEnterComponent$handleOnVerifyClickedIntent$1 loginOtpEnterComponent$handleOnVerifyClickedIntent$1 = new LoginOtpEnterComponent$handleOnVerifyClickedIntent$1(this.this$0, this.$phoneNumber, this.$countryCode, this.$refNo, continuation);
        loginOtpEnterComponent$handleOnVerifyClickedIntent$1.L$0 = obj;
        return loginOtpEnterComponent$handleOnVerifyClickedIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LoginOtpEnterComponent$handleOnVerifyClickedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:30:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00de  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x0135  */
    /* JADX WARN: Code duplicated, block: B:44:0x0139  */
    /* JADX WARN: Code duplicated, block: B:49:0x017a  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
    
        if (r0 == r6) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0159, code lost:
    
        if (r0 == r6) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01bc, code lost:
    
        if (r0 == r6) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01e6, code lost:
    
        if (r0 == r6) goto L67;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.otp.LoginOtpEnterComponent$handleOnVerifyClickedIntent$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

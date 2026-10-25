package app.chalo.userprofile.ui.minprofileupdate;

import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.userprofile.domain.UpdateUserProfileResult;
import java.util.List;
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
@DebugMetadata(c = "app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent$submitProfileUpdate$1", f = "MinProfileUpdateComponent.kt", l = {645, 651, 666}, m = "invokeSuspend", v = 1)
final class MinProfileUpdateComponent$submitProfileUpdate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UserProfileAppModel $initialProfile;
    final /* synthetic */ List<MinProfileInputState> $profileInputSequence;
    Object L$0;
    int label;
    final /* synthetic */ MinProfileUpdateComponent this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10389a;

        static {
            int[] iArr = new int[UpdateUserProfileResult.values().length];
            try {
                iArr[UpdateUserProfileResult.PROFILE_UPDATED_SUCCESSFULLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UpdateUserProfileResult.USER_NOT_LOGGED_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UpdateUserProfileResult.INVALID_DOB.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UpdateUserProfileResult.USER_DOES_NOT_EXIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UpdateUserProfileResult.USER_ID_MISMATCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UpdateUserProfileResult.UNKNOWN_LOCAL_EXCEPTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UpdateUserProfileResult.SERVER_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[UpdateUserProfileResult.RESPONSE_PARSE_EXCEPTION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[UpdateUserProfileResult.INVALID_RESPONSE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f10389a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinProfileUpdateComponent$submitProfileUpdate$1(MinProfileUpdateComponent minProfileUpdateComponent, UserProfileAppModel userProfileAppModel, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = minProfileUpdateComponent;
        this.$initialProfile = userProfileAppModel;
        this.$profileInputSequence = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MinProfileUpdateComponent$submitProfileUpdate$1(this.this$0, this.$initialProfile, this.$profileInputSequence, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MinProfileUpdateComponent$submitProfileUpdate$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0230  */
    /* JADX WARN: Code duplicated, block: B:95:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:97:0x01fd  */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0227, code lost:
    
        if (r0 == r9) goto L99;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent$submitProfileUpdate$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

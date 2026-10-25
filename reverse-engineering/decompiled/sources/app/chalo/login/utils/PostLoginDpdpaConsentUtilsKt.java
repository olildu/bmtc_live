package app.chalo.login.utils;

import app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel;
import app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModelKt;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"login_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class PostLoginDpdpaConsentUtilsKt {
    /* JADX WARN: Code duplicated, block: B:27:0x009f  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(DpdpaConsentManager dpdpaConsentManager, UserProfileAppModel userProfileAppModel, Function1 function1, Function1 function2, Function1 function3, ContinuationImpl continuationImpl) {
        PostLoginDpdpaConsentUtilsKt$handlePostLogin$1 postLoginDpdpaConsentUtilsKt$handlePostLogin$1;
        Function1 function4;
        DpdpaConsentManager dpdpaConsentManager2;
        Function1 function5;
        ChaloUseCaseResult chaloUseCaseResult;
        Function1 function6;
        if (continuationImpl instanceof PostLoginDpdpaConsentUtilsKt$handlePostLogin$1) {
            postLoginDpdpaConsentUtilsKt$handlePostLogin$1 = (PostLoginDpdpaConsentUtilsKt$handlePostLogin$1) continuationImpl;
            int i = postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = i - Integer.MIN_VALUE;
            } else {
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1 = new PostLoginDpdpaConsentUtilsKt$handlePostLogin$1(continuationImpl);
            }
        } else {
            postLoginDpdpaConsentUtilsKt$handlePostLogin$1 = new PostLoginDpdpaConsentUtilsKt$handlePostLogin$1(continuationImpl);
        }
        Object objC = postLoginDpdpaConsentUtilsKt$handlePostLogin$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label;
        Unit unit = Unit.f17538a;
        switch (i2) {
            case 0:
                ResultKt.b(objC);
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = dpdpaConsentManager;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = userProfileAppModel;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = function1;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = function2;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$4 = function3;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 1;
                if (dpdpaConsentManager.a(true, postLoginDpdpaConsentUtilsKt$handlePostLogin$1) != coroutineSingletons) {
                    String str = userProfileAppModel.i;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = dpdpaConsentManager;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = function1;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = function2;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = function3;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$4 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 2;
                    objC = dpdpaConsentManager.c(str, postLoginDpdpaConsentUtilsKt$handlePostLogin$1, true);
                    if (objC != coroutineSingletons) {
                        function4 = function2;
                        dpdpaConsentManager2 = dpdpaConsentManager;
                        function5 = function3;
                        chaloUseCaseResult = (ChaloUseCaseResult) objC;
                        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                            if (DpdpaUserConsentsInfoAppModelKt.a((DpdpaUserConsentsInfoAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a)) {
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = null;
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = null;
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = null;
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = null;
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 3;
                                if (function1.invoke(postLoginDpdpaConsentUtilsKt$handlePostLogin$1) != coroutineSingletons) {
                                    return unit;
                                }
                            } else {
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = function4;
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = null;
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = null;
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = null;
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 4;
                                if (dpdpaConsentManager2.a(false, postLoginDpdpaConsentUtilsKt$handlePostLogin$1) != coroutineSingletons) {
                                    function6 = function4;
                                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = null;
                                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 5;
                                    if (function6.invoke(postLoginDpdpaConsentUtilsKt$handlePostLogin$1) != coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                        } else {
                            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = null;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = null;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = null;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = null;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 6;
                            if (function5.invoke(postLoginDpdpaConsentUtilsKt$handlePostLogin$1) == coroutineSingletons) {
                                return unit;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                function3 = (Function1) postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$4;
                function2 = (Function1) postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3;
                function1 = (Function1) postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2;
                userProfileAppModel = (UserProfileAppModel) postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1;
                dpdpaConsentManager = (DpdpaConsentManager) postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0;
                ResultKt.b(objC);
                String str2 = userProfileAppModel.i;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = dpdpaConsentManager;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = function1;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = function2;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = function3;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$4 = null;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 2;
                objC = dpdpaConsentManager.c(str2, postLoginDpdpaConsentUtilsKt$handlePostLogin$1, true);
                if (objC != coroutineSingletons) {
                    function4 = function2;
                    dpdpaConsentManager2 = dpdpaConsentManager;
                    function5 = function3;
                    chaloUseCaseResult = (ChaloUseCaseResult) objC;
                    if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                        if (DpdpaUserConsentsInfoAppModelKt.a((DpdpaUserConsentsInfoAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a)) {
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = null;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = null;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = null;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = null;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 3;
                            if (function1.invoke(postLoginDpdpaConsentUtilsKt$handlePostLogin$1) != coroutineSingletons) {
                                return unit;
                            }
                        } else {
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = function4;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = null;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = null;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = null;
                            postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 4;
                            if (dpdpaConsentManager2.a(false, postLoginDpdpaConsentUtilsKt$handlePostLogin$1) != coroutineSingletons) {
                                function6 = function4;
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = null;
                                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 5;
                                if (function6.invoke(postLoginDpdpaConsentUtilsKt$handlePostLogin$1) != coroutineSingletons) {
                                    return unit;
                                }
                            }
                        }
                    } else {
                        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = null;
                        postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = null;
                        postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = null;
                        postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = null;
                        postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 6;
                        if (function5.invoke(postLoginDpdpaConsentUtilsKt$handlePostLogin$1) == coroutineSingletons) {
                            return unit;
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                function5 = (Function1) postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3;
                function4 = (Function1) postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2;
                function1 = (Function1) postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1;
                dpdpaConsentManager2 = (DpdpaConsentManager) postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0;
                ResultKt.b(objC);
                chaloUseCaseResult = (ChaloUseCaseResult) objC;
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                    if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 6;
                    if (function5.invoke(postLoginDpdpaConsentUtilsKt$handlePostLogin$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    return unit;
                }
                if (DpdpaUserConsentsInfoAppModelKt.a((DpdpaUserConsentsInfoAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a)) {
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 3;
                    if (function1.invoke(postLoginDpdpaConsentUtilsKt$handlePostLogin$1) != coroutineSingletons) {
                        return unit;
                    }
                } else {
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = function4;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$1 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$2 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$3 = null;
                    postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 4;
                    if (dpdpaConsentManager2.a(false, postLoginDpdpaConsentUtilsKt$handlePostLogin$1) != coroutineSingletons) {
                        function6 = function4;
                        postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = null;
                        postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 5;
                        if (function6.invoke(postLoginDpdpaConsentUtilsKt$handlePostLogin$1) != coroutineSingletons) {
                            return unit;
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                ResultKt.b(objC);
                return unit;
            case 4:
                function6 = (Function1) postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0;
                ResultKt.b(objC);
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.L$0 = null;
                postLoginDpdpaConsentUtilsKt$handlePostLogin$1.label = 5;
                if (function6.invoke(postLoginDpdpaConsentUtilsKt$handlePostLogin$1) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 5:
                ResultKt.b(objC);
                return unit;
            case 6:
                ResultKt.b(objC);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}

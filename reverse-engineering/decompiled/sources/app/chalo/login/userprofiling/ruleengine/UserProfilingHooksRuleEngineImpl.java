package app.chalo.login.userprofiling.ruleengine;

import app.chalo.login.userprofiling.data.UserProfilingHooksRuleConfig;
import app.chalo.login.userprofiling.data.UserProfilingHooksRulesForCity;
import app.chalo.login.userprofiling.domain.FetchUserProfilingHooksRulesConfigUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.userprofiling.ruleengine.RuleDecision;
import app.chalo.userprofiling.ruleengine.RuleDecisionReason;
import app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine;
import defpackage.t10;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/login/userprofiling/ruleengine/UserProfilingHooksRuleEngineImpl;", "Lapp/chalo/userprofiling/ruleengine/UserProfilingHooksRuleEngine;", "EvaluationContext", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserProfilingHooksRuleEngineImpl implements UserProfilingHooksRuleEngine {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f5387a;
    public final UserProfilingHooksRuleEngineDataStore b;
    public final FetchUserProfilingHooksRulesConfigUseCase c;
    public final CoroutineContextProvider d;
    public final MutexImpl e = MutexKt.a();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/userprofiling/ruleengine/UserProfilingHooksRuleEngineImpl$EvaluationContext;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EvaluationContext {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5388a;
        public final UserProfilingHooksRuleConfig b;
        public final long c;
        public final long d;

        public EvaluationContext(String userId, UserProfilingHooksRuleConfig rule, long j, long j2) {
            Intrinsics.i(userId, "userId");
            Intrinsics.i(rule, "rule");
            this.f5388a = userId;
            this.b = rule;
            this.c = j;
            this.d = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EvaluationContext)) {
                return false;
            }
            EvaluationContext evaluationContext = (EvaluationContext) obj;
            return Intrinsics.d(this.f5388a, evaluationContext.f5388a) && Intrinsics.d(this.b, evaluationContext.b) && this.c == evaluationContext.c && this.d == evaluationContext.d;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f5388a.hashCode() * 31)) * 31;
            long j = this.c;
            int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.d;
            return i + ((int) (j2 ^ (j2 >>> 32)));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EvaluationContext(userId=");
            sb.append(this.f5388a);
            sb.append(", rule=");
            sb.append(this.b);
            sb.append(", appSessionCount=");
            sb.append(this.c);
            return t10.g(this.d, ", loginSessionCount=", ")", sb);
        }
    }

    public UserProfilingHooksRuleEngineImpl(UserProfileDetailsProvider userProfileDetailsProvider, UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore, FetchUserProfilingHooksRulesConfigUseCase fetchUserProfilingHooksRulesConfigUseCase, CoroutineContextProvider coroutineContextProvider) {
        this.f5387a = userProfileDetailsProvider;
        this.b = userProfilingHooksRuleEngineDataStore;
        this.c = fetchUserProfilingHooksRulesConfigUseCase;
        this.d = coroutineContextProvider;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:106:0x01c9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:107:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:113:0x00da A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0156 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[LOOP:1: B:75:0x0141->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x009b  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108  */
    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:63:0x011e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0126  */
    /* JADX WARN: Code duplicated, block: B:69:0x012d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0133  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0147  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x0159 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:92:0x0190  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a6  */
    public static final Object e(UserProfilingHooksRuleEngineImpl userProfilingHooksRuleEngineImpl, String str, ContinuationImpl continuationImpl) {
        UserProfilingHooksRuleEngineImpl$evaluateInternal$1 userProfilingHooksRuleEngineImpl$evaluateInternal$1;
        String str2;
        String str3;
        Object objA;
        String str4;
        String str5;
        Iterator it;
        Object next;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig;
        long j;
        List list;
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        String str6;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig2;
        String str7;
        String str8;
        List list2;
        Iterator it2;
        long jLongValue;
        long j3;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig3;
        EvaluationContext evaluationContext;
        EvaluationContext evaluationContext2;
        RuleDecision ruleDecision;
        Object objI;
        UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore = userProfilingHooksRuleEngineImpl.b;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineImpl$evaluateInternal$1) {
            userProfilingHooksRuleEngineImpl$evaluateInternal$1 = (UserProfilingHooksRuleEngineImpl$evaluateInternal$1) continuationImpl;
            int i = userProfilingHooksRuleEngineImpl$evaluateInternal$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineImpl$evaluateInternal$1 = new UserProfilingHooksRuleEngineImpl$evaluateInternal$1(userProfilingHooksRuleEngineImpl, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineImpl$evaluateInternal$1 = new UserProfilingHooksRuleEngineImpl$evaluateInternal$1(userProfilingHooksRuleEngineImpl, continuationImpl);
        }
        Object objK = userProfilingHooksRuleEngineImpl$evaluateInternal$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        boolean z4 = true;
        switch (userProfilingHooksRuleEngineImpl$evaluateInternal$1.label) {
            case 0:
                ResultKt.b(objK);
                UserProfileDetailsProvider userProfileDetailsProvider = userProfilingHooksRuleEngineImpl.f5387a;
                str2 = str;
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = str2;
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 1;
                objK = userProfileDetailsProvider.k(userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                if (objK != obj) {
                    str3 = (String) objK;
                    if (str3 == null) {
                        return new RuleDecision(str2, false, RuleDecisionReason.USER_NOT_LOGGED_IN);
                    }
                    FetchUserProfilingHooksRulesConfigUseCase fetchUserProfilingHooksRulesConfigUseCase = userProfilingHooksRuleEngineImpl.c;
                    userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = str2;
                    userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$1 = str3;
                    userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 2;
                    objA = fetchUserProfilingHooksRulesConfigUseCase.a(userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                    if (objA != obj) {
                        String str9 = str2;
                        str4 = str3;
                        objK = objA;
                        str5 = str9;
                        it = ((UserProfilingHooksRulesForCity) objK).b.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            userProfilingHooksRuleConfig = (UserProfilingHooksRuleConfig) next;
                            if (userProfilingHooksRuleConfig == null) {
                                return new RuleDecision(str5, false, RuleDecisionReason.RULE_NOT_FOUND);
                            }
                            if (!userProfilingHooksRuleConfig.b) {
                                return new RuleDecision(str5, false, RuleDecisionReason.RULE_DISABLED);
                            }
                            j = userProfilingHooksRuleConfig.e;
                            list = userProfilingHooksRuleConfig.f;
                            if (j != -1 || j > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            j2 = userProfilingHooksRuleConfig.h;
                            if (j2 != -1 || j2 > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (userProfilingHooksRuleConfig.c >= 0 || userProfilingHooksRuleConfig.d < 0) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (!list.isEmpty()) {
                                list2 = list;
                                if ((list2 instanceof Collection) || !list2.isEmpty()) {
                                    it2 = list2.iterator();
                                    while (it2.hasNext()) {
                                        if (((Number) it2.next()).longValue() <= 0) {
                                            z4 = false;
                                        }
                                    }
                                }
                            }
                            if (z || !z2 || !z3 || !z4) {
                                return new RuleDecision(str5, false, RuleDecisionReason.CONFIG_INVALID);
                            }
                            userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = str5;
                            userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$1 = str4;
                            userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$2 = str4;
                            userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$3 = userProfilingHooksRuleConfig;
                            userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 3;
                            objK = userProfilingHooksRuleEngineDataStore.d(userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                            if (objK != obj) {
                                str6 = str4;
                                userProfilingHooksRuleConfig2 = userProfilingHooksRuleConfig;
                                str7 = str5;
                                str8 = str6;
                                jLongValue = ((Number) objK).longValue();
                                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = str7;
                                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$1 = str8;
                                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$2 = userProfilingHooksRuleConfig2;
                                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$3 = null;
                                userProfilingHooksRuleEngineImpl$evaluateInternal$1.J$0 = jLongValue;
                                userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 4;
                                objK = userProfilingHooksRuleEngineDataStore.c(str6, userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                                if (objK != obj) {
                                    j3 = jLongValue;
                                    userProfilingHooksRuleConfig3 = userProfilingHooksRuleConfig2;
                                    String str10 = str7;
                                    String str11 = str8;
                                    long jLongValue2 = ((Number) objK).longValue();
                                    evaluationContext = new EvaluationContext(str11, userProfilingHooksRuleConfig3, j3, jLongValue2);
                                    if (j3 < userProfilingHooksRuleConfig3.c || jLongValue2 < userProfilingHooksRuleConfig3.d) {
                                        return new RuleDecision(str10, false, RuleDecisionReason.BEFORE_DELAY);
                                    }
                                    userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = evaluationContext;
                                    userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$1 = null;
                                    userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$2 = null;
                                    userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 5;
                                    objK = userProfilingHooksRuleEngineImpl.g(evaluationContext, userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                                    if (objK != obj) {
                                        evaluationContext2 = evaluationContext;
                                        ruleDecision = (RuleDecision) objK;
                                        if (ruleDecision != null) {
                                            return ruleDecision;
                                        }
                                        userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = null;
                                        userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 6;
                                        objI = userProfilingHooksRuleEngineImpl.i(evaluationContext2, userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                                        if (objI != obj) {
                                            return objI;
                                        }
                                    }
                                }
                            }
                        } while (!Intrinsics.d(((UserProfilingHooksRuleConfig) next).f5368a, str5));
                        userProfilingHooksRuleConfig = (UserProfilingHooksRuleConfig) next;
                        if (userProfilingHooksRuleConfig == null) {
                            return new RuleDecision(str5, false, RuleDecisionReason.RULE_NOT_FOUND);
                        }
                        if (!userProfilingHooksRuleConfig.b) {
                            return new RuleDecision(str5, false, RuleDecisionReason.RULE_DISABLED);
                        }
                        j = userProfilingHooksRuleConfig.e;
                        list = userProfilingHooksRuleConfig.f;
                        if (j != -1) {
                            z = true;
                        } else {
                            z = true;
                        }
                        j2 = userProfilingHooksRuleConfig.h;
                        if (j2 != -1) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (userProfilingHooksRuleConfig.c >= 0) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (!list.isEmpty()) {
                            list2 = list;
                            if (list2 instanceof Collection) {
                                it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (((Number) it2.next()).longValue() <= 0) {
                                        z4 = false;
                                    }
                                }
                            } else {
                                it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (((Number) it2.next()).longValue() <= 0) {
                                        z4 = false;
                                    }
                                }
                            }
                        }
                        if (z) {
                        }
                        return new RuleDecision(str5, false, RuleDecisionReason.CONFIG_INVALID);
                    }
                }
                return obj;
            case 1:
                str2 = (String) userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0;
                ResultKt.b(objK);
                str3 = (String) objK;
                if (str3 == null) {
                    return new RuleDecision(str2, false, RuleDecisionReason.USER_NOT_LOGGED_IN);
                }
                FetchUserProfilingHooksRulesConfigUseCase fetchUserProfilingHooksRulesConfigUseCase2 = userProfilingHooksRuleEngineImpl.c;
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = str2;
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$1 = str3;
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 2;
                objA = fetchUserProfilingHooksRulesConfigUseCase2.a(userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                if (objA != obj) {
                    String str12 = str2;
                    str4 = str3;
                    objK = objA;
                    str5 = str12;
                    it = ((UserProfilingHooksRulesForCity) objK).b.iterator();
                    do {
                        if (it.hasNext()) {
                            next = it.next();
                        } else {
                            next = null;
                        }
                        userProfilingHooksRuleConfig = (UserProfilingHooksRuleConfig) next;
                        if (userProfilingHooksRuleConfig == null) {
                            return new RuleDecision(str5, false, RuleDecisionReason.RULE_NOT_FOUND);
                        }
                        if (!userProfilingHooksRuleConfig.b) {
                            return new RuleDecision(str5, false, RuleDecisionReason.RULE_DISABLED);
                        }
                        j = userProfilingHooksRuleConfig.e;
                        list = userProfilingHooksRuleConfig.f;
                        if (j != -1) {
                            z = true;
                        } else {
                            z = true;
                        }
                        j2 = userProfilingHooksRuleConfig.h;
                        if (j2 != -1) {
                            z2 = true;
                        } else {
                            z2 = true;
                        }
                        if (userProfilingHooksRuleConfig.c >= 0) {
                            z3 = false;
                        } else {
                            z3 = false;
                        }
                        if (!list.isEmpty()) {
                            list2 = list;
                            if (list2 instanceof Collection) {
                                it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (((Number) it2.next()).longValue() <= 0) {
                                        z4 = false;
                                    }
                                }
                            } else {
                                it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (((Number) it2.next()).longValue() <= 0) {
                                        z4 = false;
                                    }
                                }
                            }
                        }
                        if (z) {
                        }
                        return new RuleDecision(str5, false, RuleDecisionReason.CONFIG_INVALID);
                    } while (!Intrinsics.d(((UserProfilingHooksRuleConfig) next).f5368a, str5));
                    userProfilingHooksRuleConfig = (UserProfilingHooksRuleConfig) next;
                    if (userProfilingHooksRuleConfig == null) {
                        return new RuleDecision(str5, false, RuleDecisionReason.RULE_NOT_FOUND);
                    }
                    if (!userProfilingHooksRuleConfig.b) {
                        return new RuleDecision(str5, false, RuleDecisionReason.RULE_DISABLED);
                    }
                    j = userProfilingHooksRuleConfig.e;
                    list = userProfilingHooksRuleConfig.f;
                    if (j != -1) {
                        z = true;
                    } else {
                        z = true;
                    }
                    j2 = userProfilingHooksRuleConfig.h;
                    if (j2 != -1) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (userProfilingHooksRuleConfig.c >= 0) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (!list.isEmpty()) {
                        list2 = list;
                        if (list2 instanceof Collection) {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).longValue() <= 0) {
                                    z4 = false;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).longValue() <= 0) {
                                    z4 = false;
                                }
                            }
                        }
                    }
                    if (z) {
                    }
                    return new RuleDecision(str5, false, RuleDecisionReason.CONFIG_INVALID);
                }
                return obj;
            case 2:
                str4 = (String) userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$1;
                str5 = (String) userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0;
                ResultKt.b(objK);
                it = ((UserProfilingHooksRulesForCity) objK).b.iterator();
                do {
                    if (it.hasNext()) {
                        next = it.next();
                    } else {
                        next = null;
                    }
                    userProfilingHooksRuleConfig = (UserProfilingHooksRuleConfig) next;
                    if (userProfilingHooksRuleConfig == null) {
                        return new RuleDecision(str5, false, RuleDecisionReason.RULE_NOT_FOUND);
                    }
                    if (!userProfilingHooksRuleConfig.b) {
                        return new RuleDecision(str5, false, RuleDecisionReason.RULE_DISABLED);
                    }
                    j = userProfilingHooksRuleConfig.e;
                    list = userProfilingHooksRuleConfig.f;
                    if (j != -1) {
                        z = true;
                    } else {
                        z = true;
                    }
                    j2 = userProfilingHooksRuleConfig.h;
                    if (j2 != -1) {
                        z2 = true;
                    } else {
                        z2 = true;
                    }
                    if (userProfilingHooksRuleConfig.c >= 0) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    if (!list.isEmpty()) {
                        list2 = list;
                        if (list2 instanceof Collection) {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).longValue() <= 0) {
                                    z4 = false;
                                }
                            }
                        } else {
                            it2 = list2.iterator();
                            while (it2.hasNext()) {
                                if (((Number) it2.next()).longValue() <= 0) {
                                    z4 = false;
                                }
                            }
                        }
                    }
                    if (z) {
                    }
                    return new RuleDecision(str5, false, RuleDecisionReason.CONFIG_INVALID);
                } while (!Intrinsics.d(((UserProfilingHooksRuleConfig) next).f5368a, str5));
                userProfilingHooksRuleConfig = (UserProfilingHooksRuleConfig) next;
                if (userProfilingHooksRuleConfig == null) {
                    return new RuleDecision(str5, false, RuleDecisionReason.RULE_NOT_FOUND);
                }
                if (!userProfilingHooksRuleConfig.b) {
                    return new RuleDecision(str5, false, RuleDecisionReason.RULE_DISABLED);
                }
                j = userProfilingHooksRuleConfig.e;
                list = userProfilingHooksRuleConfig.f;
                if (j != -1) {
                    z = true;
                } else {
                    z = true;
                }
                j2 = userProfilingHooksRuleConfig.h;
                if (j2 != -1) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                if (userProfilingHooksRuleConfig.c >= 0) {
                    z3 = false;
                } else {
                    z3 = false;
                }
                if (!list.isEmpty()) {
                    list2 = list;
                    if (list2 instanceof Collection) {
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((Number) it2.next()).longValue() <= 0) {
                                z4 = false;
                            }
                        }
                    } else {
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((Number) it2.next()).longValue() <= 0) {
                                z4 = false;
                            }
                        }
                    }
                }
                if (z) {
                }
                return new RuleDecision(str5, false, RuleDecisionReason.CONFIG_INVALID);
            case 3:
                userProfilingHooksRuleConfig2 = (UserProfilingHooksRuleConfig) userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$3;
                String str13 = (String) userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$2;
                String str14 = (String) userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$1;
                str7 = (String) userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0;
                ResultKt.b(objK);
                str8 = str13;
                str6 = str14;
                jLongValue = ((Number) objK).longValue();
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = str7;
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$1 = str8;
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$2 = userProfilingHooksRuleConfig2;
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$3 = null;
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.J$0 = jLongValue;
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 4;
                objK = userProfilingHooksRuleEngineDataStore.c(str6, userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                if (objK != obj) {
                    j3 = jLongValue;
                    userProfilingHooksRuleConfig3 = userProfilingHooksRuleConfig2;
                    String str15 = str7;
                    String str16 = str8;
                    long jLongValue3 = ((Number) objK).longValue();
                    evaluationContext = new EvaluationContext(str16, userProfilingHooksRuleConfig3, j3, jLongValue3);
                    if (j3 < userProfilingHooksRuleConfig3.c) {
                        userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = evaluationContext;
                        userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$1 = null;
                        userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$2 = null;
                        userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 5;
                        objK = userProfilingHooksRuleEngineImpl.g(evaluationContext, userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                        if (objK != obj) {
                            evaluationContext2 = evaluationContext;
                            ruleDecision = (RuleDecision) objK;
                            if (ruleDecision != null) {
                                return ruleDecision;
                            }
                            userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = null;
                            userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 6;
                            objI = userProfilingHooksRuleEngineImpl.i(evaluationContext2, userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                            if (objI != obj) {
                                return objI;
                            }
                        }
                    }
                    return new RuleDecision(str15, false, RuleDecisionReason.BEFORE_DELAY);
                }
                return obj;
            case 4:
                long j4 = userProfilingHooksRuleEngineImpl$evaluateInternal$1.J$0;
                UserProfilingHooksRuleConfig userProfilingHooksRuleConfig4 = (UserProfilingHooksRuleConfig) userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$2;
                str8 = (String) userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$1;
                str7 = (String) userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0;
                ResultKt.b(objK);
                userProfilingHooksRuleConfig3 = userProfilingHooksRuleConfig4;
                j3 = j4;
                String str17 = str7;
                String str18 = str8;
                long jLongValue4 = ((Number) objK).longValue();
                evaluationContext = new EvaluationContext(str18, userProfilingHooksRuleConfig3, j3, jLongValue4);
                if (j3 < userProfilingHooksRuleConfig3.c) {
                    userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = evaluationContext;
                    userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$1 = null;
                    userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$2 = null;
                    userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 5;
                    objK = userProfilingHooksRuleEngineImpl.g(evaluationContext, userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                    if (objK != obj) {
                        evaluationContext2 = evaluationContext;
                        ruleDecision = (RuleDecision) objK;
                        if (ruleDecision != null) {
                            return ruleDecision;
                        }
                        userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = null;
                        userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 6;
                        objI = userProfilingHooksRuleEngineImpl.i(evaluationContext2, userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                        if (objI != obj) {
                            return objI;
                        }
                    }
                    return obj;
                }
                return new RuleDecision(str17, false, RuleDecisionReason.BEFORE_DELAY);
            case 5:
                evaluationContext2 = (EvaluationContext) userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0;
                ResultKt.b(objK);
                ruleDecision = (RuleDecision) objK;
                if (ruleDecision != null) {
                    return ruleDecision;
                }
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.L$0 = null;
                userProfilingHooksRuleEngineImpl$evaluateInternal$1.label = 6;
                objI = userProfilingHooksRuleEngineImpl.i(evaluationContext2, userProfilingHooksRuleEngineImpl$evaluateInternal$1);
                if (objI != obj) {
                    return obj;
                }
                return objI;
            case 6:
                ResultKt.b(objK);
                return objK;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine
    public final Object a(String str, ContinuationImpl continuationImpl) {
        return BuildersKt.g(this.d.b(), new UserProfilingHooksRuleEngineImpl$evaluate$2(this, str, null), continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x008f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[Catch: all -> 0x005f, TRY_ENTER, TryCatch #3 {all -> 0x005f, blocks: (B:46:0x00a2, B:27:0x005b, B:39:0x008b, B:43:0x0093), top: B:62:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2 A[Catch: all -> 0x005f, PHI: r2 r12
      0x00a2: PHI (r2v7 kotlinx.coroutines.sync.Mutex) = (r2v5 kotlinx.coroutines.sync.Mutex), (r2v14 kotlinx.coroutines.sync.Mutex) binds: [B:44:0x009f, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r12v9 java.lang.String) = (r12v7 java.lang.String), (r12v14 java.lang.String) binds: [B:44:0x009f, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x005f, blocks: (B:46:0x00a2, B:27:0x005b, B:39:0x008b, B:43:0x0093), top: B:62:0x005b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00af  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine
    public final Object b(ContinuationImpl continuationImpl) throws Throwable {
        UserProfilingHooksRuleEngineImpl$onLogout$1 userProfilingHooksRuleEngineImpl$onLogout$1;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Mutex mutex3;
        String str;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineImpl$onLogout$1) {
            userProfilingHooksRuleEngineImpl$onLogout$1 = (UserProfilingHooksRuleEngineImpl$onLogout$1) continuationImpl;
            int i = userProfilingHooksRuleEngineImpl$onLogout$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineImpl$onLogout$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineImpl$onLogout$1 = new UserProfilingHooksRuleEngineImpl$onLogout$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineImpl$onLogout$1 = new UserProfilingHooksRuleEngineImpl$onLogout$1(this, continuationImpl);
        }
        Object obj = userProfilingHooksRuleEngineImpl$onLogout$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineImpl$onLogout$1.label;
        UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore = this.b;
        Unit unit = Unit.f17538a;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                mutex = this.e;
                userProfilingHooksRuleEngineImpl$onLogout$1.L$0 = mutex;
                userProfilingHooksRuleEngineImpl$onLogout$1.label = 1;
                if (mutex.a(userProfilingHooksRuleEngineImpl$onLogout$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                Mutex mutex4 = (Mutex) userProfilingHooksRuleEngineImpl$onLogout$1.L$0;
                ResultKt.b(obj);
                mutex = mutex4;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        String str2 = (String) userProfilingHooksRuleEngineImpl$onLogout$1.L$1;
                        Mutex mutex5 = (Mutex) userProfilingHooksRuleEngineImpl$onLogout$1.L$0;
                        try {
                            ResultKt.b(obj);
                            str = str2;
                            mutex3 = mutex5;
                            userProfilingHooksRuleEngineImpl$onLogout$1.L$0 = mutex3;
                            userProfilingHooksRuleEngineImpl$onLogout$1.L$1 = null;
                            userProfilingHooksRuleEngineImpl$onLogout$1.label = 4;
                            if (userProfilingHooksRuleEngineDataStore.a(str, userProfilingHooksRuleEngineImpl$onLogout$1) != coroutineSingletons) {
                                mutex2 = mutex3;
                                mutex2.e(null);
                                return unit;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2 = mutex5;
                        }
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) userProfilingHooksRuleEngineImpl$onLogout$1.L$0;
                        try {
                            ResultKt.b(obj);
                            mutex2.e(null);
                            return unit;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    mutex2.e(null);
                    throw th;
                }
                mutex3 = (Mutex) userProfilingHooksRuleEngineImpl$onLogout$1.L$0;
                try {
                    ResultKt.b(obj);
                    str = (String) obj;
                    if (str == null) {
                        mutex3.e(null);
                        return unit;
                    }
                    userProfilingHooksRuleEngineImpl$onLogout$1.L$0 = mutex3;
                    userProfilingHooksRuleEngineImpl$onLogout$1.L$1 = str;
                    userProfilingHooksRuleEngineImpl$onLogout$1.label = 3;
                    if (userProfilingHooksRuleEngineDataStore.f(0L, str, userProfilingHooksRuleEngineImpl$onLogout$1) == coroutineSingletons) {
                        userProfilingHooksRuleEngineImpl$onLogout$1.L$0 = mutex3;
                        userProfilingHooksRuleEngineImpl$onLogout$1.L$1 = null;
                        userProfilingHooksRuleEngineImpl$onLogout$1.label = 4;
                        if (userProfilingHooksRuleEngineDataStore.a(str, userProfilingHooksRuleEngineImpl$onLogout$1) != coroutineSingletons) {
                            mutex2 = mutex3;
                            mutex2.e(null);
                            return unit;
                        }
                    }
                    return coroutineSingletons;
                } catch (Throwable th4) {
                    th = th4;
                    mutex2 = mutex3;
                }
            }
            UserProfileDetailsProvider userProfileDetailsProvider = this.f5387a;
            userProfilingHooksRuleEngineImpl$onLogout$1.L$0 = mutex;
            userProfilingHooksRuleEngineImpl$onLogout$1.label = 2;
            Object objK = userProfileDetailsProvider.k(userProfilingHooksRuleEngineImpl$onLogout$1);
            if (objK != coroutineSingletons) {
                mutex3 = mutex;
                obj = objK;
                str = (String) obj;
                if (str == null) {
                    mutex3.e(null);
                    return unit;
                }
                userProfilingHooksRuleEngineImpl$onLogout$1.L$0 = mutex3;
                userProfilingHooksRuleEngineImpl$onLogout$1.L$1 = str;
                userProfilingHooksRuleEngineImpl$onLogout$1.label = 3;
                if (userProfilingHooksRuleEngineDataStore.f(0L, str, userProfilingHooksRuleEngineImpl$onLogout$1) == coroutineSingletons) {
                    userProfilingHooksRuleEngineImpl$onLogout$1.L$0 = mutex3;
                    userProfilingHooksRuleEngineImpl$onLogout$1.L$1 = null;
                    userProfilingHooksRuleEngineImpl$onLogout$1.label = 4;
                    if (userProfilingHooksRuleEngineDataStore.a(str, userProfilingHooksRuleEngineImpl$onLogout$1) != coroutineSingletons) {
                        mutex2 = mutex3;
                        mutex2.e(null);
                        return unit;
                    }
                }
            }
            return coroutineSingletons;
        } catch (Throwable th5) {
            mutex2 = mutex;
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095 A[Catch: all -> 0x0060, TRY_ENTER, TryCatch #1 {all -> 0x0060, blocks: (B:47:0x00a5, B:27:0x005c, B:39:0x008d, B:43:0x0095), top: B:59:0x005c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine
    public final Object c(ContinuationImpl continuationImpl) throws Throwable {
        UserProfilingHooksRuleEngineImpl$onLogin$1 userProfilingHooksRuleEngineImpl$onLogin$1;
        Mutex mutex;
        Mutex mutex2;
        Throwable th;
        Mutex mutex3;
        String str;
        Object objC;
        String str2;
        long jLongValue;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineImpl$onLogin$1) {
            userProfilingHooksRuleEngineImpl$onLogin$1 = (UserProfilingHooksRuleEngineImpl$onLogin$1) continuationImpl;
            int i = userProfilingHooksRuleEngineImpl$onLogin$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineImpl$onLogin$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineImpl$onLogin$1 = new UserProfilingHooksRuleEngineImpl$onLogin$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineImpl$onLogin$1 = new UserProfilingHooksRuleEngineImpl$onLogin$1(this, continuationImpl);
        }
        Object obj = userProfilingHooksRuleEngineImpl$onLogin$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineImpl$onLogin$1.label;
        UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore = this.b;
        Unit unit = Unit.f17538a;
        try {
            if (i2 == 0) {
                ResultKt.b(obj);
                mutex = this.e;
                userProfilingHooksRuleEngineImpl$onLogin$1.L$0 = mutex;
                userProfilingHooksRuleEngineImpl$onLogin$1.label = 1;
                if (mutex.a(userProfilingHooksRuleEngineImpl$onLogin$1) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                Mutex mutex4 = (Mutex) userProfilingHooksRuleEngineImpl$onLogin$1.L$0;
                ResultKt.b(obj);
                mutex = mutex4;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        String str3 = (String) userProfilingHooksRuleEngineImpl$onLogin$1.L$1;
                        Mutex mutex5 = (Mutex) userProfilingHooksRuleEngineImpl$onLogin$1.L$0;
                        try {
                            ResultKt.b(obj);
                            str2 = str3;
                            mutex3 = mutex5;
                            jLongValue = ((Number) obj).longValue() + 1;
                            userProfilingHooksRuleEngineImpl$onLogin$1.L$0 = mutex3;
                            userProfilingHooksRuleEngineImpl$onLogin$1.L$1 = null;
                            userProfilingHooksRuleEngineImpl$onLogin$1.label = 4;
                            if (userProfilingHooksRuleEngineDataStore.f(jLongValue, str2, userProfilingHooksRuleEngineImpl$onLogin$1) != coroutineSingletons) {
                                mutex2 = mutex3;
                                mutex2.e(null);
                                return unit;
                            }
                            return coroutineSingletons;
                        } catch (Throwable th2) {
                            th = th2;
                            mutex2 = mutex5;
                        }
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        mutex2 = (Mutex) userProfilingHooksRuleEngineImpl$onLogin$1.L$0;
                        try {
                            ResultKt.b(obj);
                            mutex2.e(null);
                            return unit;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                    mutex2.e(null);
                    throw th;
                }
                mutex3 = (Mutex) userProfilingHooksRuleEngineImpl$onLogin$1.L$0;
                try {
                    ResultKt.b(obj);
                    str = (String) obj;
                    if (str == null) {
                        mutex3.e(null);
                        return unit;
                    }
                    userProfilingHooksRuleEngineImpl$onLogin$1.L$0 = mutex3;
                    userProfilingHooksRuleEngineImpl$onLogin$1.L$1 = str;
                    userProfilingHooksRuleEngineImpl$onLogin$1.label = 3;
                    objC = userProfilingHooksRuleEngineDataStore.c(str, userProfilingHooksRuleEngineImpl$onLogin$1);
                    if (objC == coroutineSingletons) {
                        str2 = str;
                        obj = objC;
                        jLongValue = ((Number) obj).longValue() + 1;
                        userProfilingHooksRuleEngineImpl$onLogin$1.L$0 = mutex3;
                        userProfilingHooksRuleEngineImpl$onLogin$1.L$1 = null;
                        userProfilingHooksRuleEngineImpl$onLogin$1.label = 4;
                        if (userProfilingHooksRuleEngineDataStore.f(jLongValue, str2, userProfilingHooksRuleEngineImpl$onLogin$1) != coroutineSingletons) {
                            mutex2 = mutex3;
                            mutex2.e(null);
                            return unit;
                        }
                    }
                    return coroutineSingletons;
                } catch (Throwable th4) {
                    th = th4;
                    mutex2 = mutex3;
                }
            }
            UserProfileDetailsProvider userProfileDetailsProvider = this.f5387a;
            userProfilingHooksRuleEngineImpl$onLogin$1.L$0 = mutex;
            userProfilingHooksRuleEngineImpl$onLogin$1.label = 2;
            Object objK = userProfileDetailsProvider.k(userProfilingHooksRuleEngineImpl$onLogin$1);
            if (objK != coroutineSingletons) {
                mutex3 = mutex;
                obj = objK;
                str = (String) obj;
                if (str == null) {
                    mutex3.e(null);
                    return unit;
                }
                userProfilingHooksRuleEngineImpl$onLogin$1.L$0 = mutex3;
                userProfilingHooksRuleEngineImpl$onLogin$1.L$1 = str;
                userProfilingHooksRuleEngineImpl$onLogin$1.label = 3;
                objC = userProfilingHooksRuleEngineDataStore.c(str, userProfilingHooksRuleEngineImpl$onLogin$1);
                if (objC == coroutineSingletons) {
                    str2 = str;
                    obj = objC;
                    jLongValue = ((Number) obj).longValue() + 1;
                    userProfilingHooksRuleEngineImpl$onLogin$1.L$0 = mutex3;
                    userProfilingHooksRuleEngineImpl$onLogin$1.L$1 = null;
                    userProfilingHooksRuleEngineImpl$onLogin$1.label = 4;
                    if (userProfilingHooksRuleEngineDataStore.f(jLongValue, str2, userProfilingHooksRuleEngineImpl$onLogin$1) != coroutineSingletons) {
                        mutex2 = mutex3;
                        mutex2.e(null);
                        return unit;
                    }
                }
            }
            return coroutineSingletons;
        } catch (Throwable th5) {
            mutex2 = mutex;
            th = th5;
        }
    }

    @Override // app.chalo.userprofiling.ruleengine.UserProfilingHooksRuleEngine
    public final Object d(String str, Continuation continuation) throws Throwable {
        Object objG = BuildersKt.g(this.d.b(), new UserProfilingHooksRuleEngineImpl$markShown$2(this, str, null), continuation);
        return objG == CoroutineSingletons.COROUTINE_SUSPENDED ? objG : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object f(EvaluationContext evaluationContext, ContinuationImpl continuationImpl) {
        UserProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1 userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1;
        long j;
        String str;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig;
        SessionCountInfo sessionCountInfo;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig2;
        SessionCountInfo sessionCountInfo2;
        boolean z;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1) {
            userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1 = (UserProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1) continuationImpl;
            int i = userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1 = new UserProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1 = new UserProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1(this, continuationImpl);
        }
        Object obj = userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.label;
        UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore = this.b;
        if (i2 != 0) {
            if (i2 == 1) {
                j = userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.J$0;
                str = (String) userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.L$1;
                userProfilingHooksRuleConfig = (UserProfilingHooksRuleConfig) userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.L$0;
                ResultKt.b(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sessionCountInfo2 = (SessionCountInfo) userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.L$1;
                userProfilingHooksRuleConfig2 = (UserProfilingHooksRuleConfig) userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.L$0;
                ResultKt.b(obj);
            }
            sessionCountInfo = sessionCountInfo2;
            userProfilingHooksRuleConfig = userProfilingHooksRuleConfig2;
            if (sessionCountInfo.b < userProfilingHooksRuleConfig.h) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        ResultKt.b(obj);
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig3 = evaluationContext.b;
        String str2 = evaluationContext.f5388a;
        if (userProfilingHooksRuleConfig3.h == -1) {
            return Boolean.TRUE;
        }
        j = evaluationContext.d;
        String str3 = userProfilingHooksRuleConfig3.f5368a;
        userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.L$0 = userProfilingHooksRuleConfig3;
        userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.L$1 = str2;
        userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.J$0 = j;
        userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.label = 1;
        Object objB = userProfilingHooksRuleEngineDataStore.b(str2, str3, userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1);
        if (objB != coroutineSingletons) {
            obj = objB;
            str = str2;
            userProfilingHooksRuleConfig = userProfilingHooksRuleConfig3;
        }
        return coroutineSingletons;
        PersistedRuleState persistedRuleState = (PersistedRuleState) obj;
        if (persistedRuleState == null) {
            persistedRuleState = new PersistedRuleState(str, userProfilingHooksRuleConfig.f5368a);
        }
        PersistedRuleState persistedRuleState2 = persistedRuleState;
        SessionCountInfo sessionCountInfo3 = persistedRuleState2.f;
        if (sessionCountInfo3 == null) {
            sessionCountInfo3 = new SessionCountInfo(0L, 0L);
        }
        sessionCountInfo = sessionCountInfo3.f5380a == j ? sessionCountInfo3 : new SessionCountInfo(j, 0L);
        if (!sessionCountInfo.equals(sessionCountInfo3)) {
            PersistedRuleState persistedRuleStateA = PersistedRuleState.a(persistedRuleState2, 0, null, null, sessionCountInfo, 31);
            userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.L$0 = userProfilingHooksRuleConfig;
            userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.L$1 = sessionCountInfo;
            userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1.label = 2;
            if (userProfilingHooksRuleEngineDataStore.e(persistedRuleStateA, userProfilingHooksRuleEngineImpl$checkIsWithinSessionCapAndNormaliseIfRequired$1) != coroutineSingletons) {
                userProfilingHooksRuleConfig2 = userProfilingHooksRuleConfig;
                sessionCountInfo2 = sessionCountInfo;
                sessionCountInfo = sessionCountInfo2;
                userProfilingHooksRuleConfig = userProfilingHooksRuleConfig2;
            }
            return coroutineSingletons;
        }
        if (sessionCountInfo.b < userProfilingHooksRuleConfig.h) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x007a  */
    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(EvaluationContext evaluationContext, ContinuationImpl continuationImpl) {
        UserProfilingHooksRuleEngineImpl$checkVisibilityConditions$1 userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig;
        Object objH;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig2;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineImpl$checkVisibilityConditions$1) {
            userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1 = (UserProfilingHooksRuleEngineImpl$checkVisibilityConditions$1) continuationImpl;
            int i = userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1 = new UserProfilingHooksRuleEngineImpl$checkVisibilityConditions$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1 = new UserProfilingHooksRuleEngineImpl$checkVisibilityConditions$1(this, continuationImpl);
        }
        Object obj = userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            userProfilingHooksRuleConfig = evaluationContext.b;
            userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.L$0 = evaluationContext;
            userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.L$1 = userProfilingHooksRuleConfig;
            userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.label = 1;
            objH = h(evaluationContext, userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1);
            if (objH != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            UserProfilingHooksRuleConfig userProfilingHooksRuleConfig3 = (UserProfilingHooksRuleConfig) userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.L$1;
            EvaluationContext evaluationContext2 = (EvaluationContext) userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.L$0;
            ResultKt.b(obj);
            userProfilingHooksRuleConfig = userProfilingHooksRuleConfig3;
            evaluationContext = evaluationContext2;
            objH = obj;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userProfilingHooksRuleConfig2 = (UserProfilingHooksRuleConfig) userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.L$0;
            ResultKt.b(obj);
        }
        return ((Boolean) obj).booleanValue() ? new RuleDecision(userProfilingHooksRuleConfig2.f5368a, true, RuleDecisionReason.ELIGIBLE) : new RuleDecision(userProfilingHooksRuleConfig2.f5368a, false, RuleDecisionReason.SESSION_CAP_REACHED);
        if (!((Boolean) objH).booleanValue()) {
            return null;
        }
        userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.L$0 = userProfilingHooksRuleConfig;
        userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.L$1 = null;
        userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1.label = 2;
        Object objF = f(evaluationContext, userProfilingHooksRuleEngineImpl$checkVisibilityConditions$1);
        if (objF != obj2) {
            UserProfilingHooksRuleConfig userProfilingHooksRuleConfig4 = userProfilingHooksRuleConfig;
            obj = objF;
            userProfilingHooksRuleConfig2 = userProfilingHooksRuleConfig4;
            if (((Boolean) obj).booleanValue()) {
            }
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object h(EvaluationContext evaluationContext, ContinuationImpl continuationImpl) {
        UserProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1 userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig;
        long j;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1) {
            userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1 = (UserProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1) continuationImpl;
            int i = userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1 = new UserProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1 = new UserProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1(this, continuationImpl);
        }
        UserProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1 userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$2 = userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$1;
        Object obj = userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$2.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$2.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            UserProfilingHooksRuleConfig userProfilingHooksRuleConfig2 = evaluationContext.b;
            String str = evaluationContext.f5388a;
            if (userProfilingHooksRuleConfig2.e == -1) {
                return Boolean.TRUE;
            }
            long j2 = evaluationContext.d;
            String str2 = userProfilingHooksRuleConfig2.f5368a;
            userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$2.L$0 = userProfilingHooksRuleConfig2;
            userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$2.J$0 = j2;
            userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$2.label = 1;
            Object objJ = j(str, str2, j2, userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$2);
            if (objJ == obj2) {
                return obj2;
            }
            obj = objJ;
            userProfilingHooksRuleConfig = userProfilingHooksRuleConfig2;
            j = j2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$2.J$0;
            userProfilingHooksRuleConfig = (UserProfilingHooksRuleConfig) userProfilingHooksRuleEngineImpl$isWithinVisibilityWindow$2.L$0;
            ResultKt.b(obj);
        }
        long jLongValue = ((Number) obj).longValue();
        return Boolean.valueOf(jLongValue <= j && j <= (userProfilingHooksRuleConfig.e + jLongValue) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object i(EvaluationContext evaluationContext, ContinuationImpl continuationImpl) {
        UserProfilingHooksRuleEngineImpl$resolveCooldownDecision$1 userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig;
        Object objK;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig2;
        EvaluationContext evaluationContext2 = evaluationContext;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineImpl$resolveCooldownDecision$1) {
            userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1 = (UserProfilingHooksRuleEngineImpl$resolveCooldownDecision$1) continuationImpl;
            int i = userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1 = new UserProfilingHooksRuleEngineImpl$resolveCooldownDecision$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1 = new UserProfilingHooksRuleEngineImpl$resolveCooldownDecision$1(this, continuationImpl);
        }
        Object obj = userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.label;
        boolean z = true;
        if (i2 == 0) {
            ResultKt.b(obj);
            userProfilingHooksRuleConfig = evaluationContext2.b;
            userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.L$0 = evaluationContext2;
            userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.L$1 = userProfilingHooksRuleConfig;
            userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.label = 1;
            objK = k(evaluationContext2, userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1);
            if (objK != obj2) {
            }
            return obj2;
        }
        if (i2 == 1) {
            UserProfilingHooksRuleConfig userProfilingHooksRuleConfig3 = (UserProfilingHooksRuleConfig) userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.L$1;
            EvaluationContext evaluationContext3 = (EvaluationContext) userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.L$0;
            ResultKt.b(obj);
            userProfilingHooksRuleConfig = userProfilingHooksRuleConfig3;
            evaluationContext2 = evaluationContext3;
            objK = obj;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            userProfilingHooksRuleConfig2 = (UserProfilingHooksRuleConfig) userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.L$0;
            ResultKt.b(obj);
            z = true;
        }
        return new RuleDecision(userProfilingHooksRuleConfig2.f5368a, z, RuleDecisionReason.ELIGIBLE);
        PersistedRuleState persistedRuleState = (PersistedRuleState) objK;
        List list = userProfilingHooksRuleConfig.f;
        String str = userProfilingHooksRuleConfig.f5368a;
        if (list.isEmpty()) {
            return new RuleDecision(str, false, RuleDecisionReason.IN_FOREVER_COOLDOWN);
        }
        long j = evaluationContext2.d;
        Long l = persistedRuleState.d;
        int i3 = persistedRuleState.c;
        long jLongValue = l != null ? l.longValue() : j;
        if (userProfilingHooksRuleConfig.g) {
            int size = list.size();
            int i4 = i3 % size;
            i3 = i4 + (size & (((i4 ^ size) & ((-i4) | i4)) >> 31));
        } else if (i3 > CollectionsKt.K(list)) {
            return new RuleDecision(str, false, RuleDecisionReason.IN_FOREVER_COOLDOWN);
        }
        if (j - ((jLongValue + userProfilingHooksRuleConfig.e) - 1) <= ((Number) list.get(i3)).longValue()) {
            return new RuleDecision(str, false, RuleDecisionReason.IN_COOLDOWN);
        }
        PersistedRuleState persistedRuleStateA = PersistedRuleState.a(persistedRuleState, i3 + 1, new Long(j), null, null, 51);
        userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.L$0 = userProfilingHooksRuleConfig;
        userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.L$1 = null;
        userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1.label = 2;
        if (this.b.e(persistedRuleStateA, userProfilingHooksRuleEngineImpl$resolveCooldownDecision$1) != obj2) {
            userProfilingHooksRuleConfig2 = userProfilingHooksRuleConfig;
            return new RuleDecision(userProfilingHooksRuleConfig2.f5368a, z, RuleDecisionReason.ELIGIBLE);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public final Object j(String str, String str2, long j, ContinuationImpl continuationImpl) {
        UserProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1 userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1;
        long j2;
        long j3;
        String str3 = str;
        String str4 = str2;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1) {
            userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1 = (UserProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1) continuationImpl;
            int i = userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1 = new UserProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1 = new UserProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1(this, continuationImpl);
        }
        Object objB = userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.label;
        UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore = this.b;
        if (i2 == 0) {
            ResultKt.b(objB);
            userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.L$0 = str3;
            userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.L$1 = str4;
            j2 = j;
            userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.J$0 = j2;
            userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.label = 1;
            objB = userProfilingHooksRuleEngineDataStore.b(str3, str4, userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            long j4 = userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.J$0;
            String str5 = (String) userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.L$1;
            String str6 = (String) userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.L$0;
            ResultKt.b(objB);
            j2 = j4;
            str4 = str5;
            str3 = str6;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.J$0;
            ResultKt.b(objB);
        }
        return new Long(j3);
        PersistedRuleState persistedRuleState = (PersistedRuleState) objB;
        if ((persistedRuleState != null ? persistedRuleState.d : null) != null) {
            return persistedRuleState.d;
        }
        if (persistedRuleState == null) {
            persistedRuleState = new PersistedRuleState(str3, str4);
        }
        PersistedRuleState persistedRuleStateA = PersistedRuleState.a(persistedRuleState, 0, new Long(j2), null, null, 55);
        userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.L$0 = null;
        userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.L$1 = null;
        userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.J$0 = j2;
        userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1.label = 2;
        if (userProfilingHooksRuleEngineDataStore.e(persistedRuleStateA, userProfilingHooksRuleEngineImpl$resolveVisibilityStartSession$1) != coroutineSingletons) {
            j3 = j2;
            return new Long(j3);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(EvaluationContext evaluationContext, ContinuationImpl continuationImpl) {
        UserProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1 userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1;
        String str;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig;
        PersistedRuleState persistedRuleStateA;
        if (continuationImpl instanceof UserProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1) {
            userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1 = (UserProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1) continuationImpl;
            int i = userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.label = i - Integer.MIN_VALUE;
            } else {
                userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1 = new UserProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1(this, continuationImpl);
            }
        } else {
            userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1 = new UserProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1(this, continuationImpl);
        }
        Object objB = userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.label;
        UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore = this.b;
        if (i2 == 0) {
            ResultKt.b(objB);
            str = evaluationContext.f5388a;
            userProfilingHooksRuleConfig = evaluationContext.b;
            String str2 = userProfilingHooksRuleConfig.f5368a;
            userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.L$0 = str;
            userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.L$1 = userProfilingHooksRuleConfig;
            userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.label = 1;
            objB = userProfilingHooksRuleEngineDataStore.b(str, str2, userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            PersistedRuleState persistedRuleState = (PersistedRuleState) userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.L$0;
            ResultKt.b(objB);
            return persistedRuleState;
        }
        userProfilingHooksRuleConfig = (UserProfilingHooksRuleConfig) userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.L$1;
        str = (String) userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.L$0;
        ResultKt.b(objB);
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig2 = userProfilingHooksRuleConfig;
        PersistedRuleState persistedRuleState2 = (PersistedRuleState) objB;
        if (persistedRuleState2 == null) {
            persistedRuleState2 = new PersistedRuleState(str, userProfilingHooksRuleConfig2.f5368a);
        }
        PersistedRuleState persistedRuleState3 = persistedRuleState2;
        UserProfilingHooksRuleConfig userProfilingHooksRuleConfig3 = persistedRuleState3.e;
        if (userProfilingHooksRuleConfig3 == null || Intrinsics.d(userProfilingHooksRuleConfig3.f, userProfilingHooksRuleConfig2.f)) {
            persistedRuleStateA = !Intrinsics.d(userProfilingHooksRuleConfig3, userProfilingHooksRuleConfig2) ? PersistedRuleState.a(persistedRuleState3, 0, null, userProfilingHooksRuleConfig2, null, 47) : persistedRuleState3;
        } else {
            persistedRuleStateA = PersistedRuleState.a(persistedRuleState3, 0, null, userProfilingHooksRuleConfig2, null, 43);
        }
        if (!persistedRuleStateA.equals(persistedRuleState3)) {
            userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.L$0 = persistedRuleStateA;
            userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.L$1 = null;
            userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1.label = 2;
            if (userProfilingHooksRuleEngineDataStore.e(persistedRuleStateA, userProfilingHooksRuleEngineImpl$syncRuleConfigForCooldownEvaluation$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return persistedRuleStateA;
    }
}

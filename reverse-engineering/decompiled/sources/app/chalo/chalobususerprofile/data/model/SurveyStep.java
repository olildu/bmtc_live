package app.chalo.chalobususerprofile.data.model;

import app.chalo.chalobususerprofile.ui.compose.PBUserProfileSurveyInputState;
import defpackage.jg1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 app.chalo.chalobususerprofile.data.model.SurveyStep, still in use, count: 1, list:
  (r0v0 app.chalo.chalobususerprofile.data.model.SurveyStep) from 0x003c: FILLED_NEW_ARRAY 
  (r0v0 app.chalo.chalobususerprofile.data.model.SurveyStep)
  (r1v1 app.chalo.chalobususerprofile.data.model.SurveyStep)
  (r3v1 app.chalo.chalobususerprofile.data.model.SurveyStep)
  (r5v1 app.chalo.chalobususerprofile.data.model.SurveyStep)
 A[WRAPPED] (LINE:61) elemType: app.chalo.chalobususerprofile.data.model.SurveyStep
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u000b"}, d2 = {"Lapp/chalo/chalobususerprofile/data/model/SurveyStep;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", "WORK", "TIMING", "FREQUENCY", "toInputState", "Lapp/chalo/chalobususerprofile/ui/compose/PBUserProfileSurveyInputState;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final class SurveyStep {
    HOME,
    WORK,
    TIMING,
    FREQUENCY;

    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final List<SurveyStep> ORDERED;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/chalobususerprofile/data/model/SurveyStep$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/chalobususerprofile/data/model/SurveyStep;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SurveyStep> serializer() {
            return (KSerializer) SurveyStep.$cachedSerializer$delegate.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1199a;

        static {
            int[] iArr = new int[SurveyStep.values().length];
            try {
                iArr[SurveyStep.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SurveyStep.WORK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SurveyStep.TIMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SurveyStep.FREQUENCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f1199a = iArr;
        }
    }

    static {
        SurveyStep[] surveyStepArrValues = values();
        $ENTRIES = EnumEntriesKt.a(surveyStepArrValues);
        INSTANCE = new Companion();
        ORDERED = CollectionsKt.S(surveyStep, surveyStep, surveyStep, surveyStep);
        $cachedSerializer$delegate = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jg1(19));
    }

    private SurveyStep() {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.b("app.chalo.chalobususerprofile.data.model.SurveyStep", values());
    }

    public static EnumEntries<SurveyStep> getEntries() {
        return $ENTRIES;
    }

    public static SurveyStep valueOf(String str) {
        return (SurveyStep) Enum.valueOf(SurveyStep.class, str);
    }

    public static SurveyStep[] values() {
        return (SurveyStep[]) $VALUES.clone();
    }

    public final PBUserProfileSurveyInputState toInputState() {
        int i = WhenMappings.f1199a[ordinal()];
        if (i == 1) {
            return new PBUserProfileSurveyInputState.HomeLocationInputPBUserProfile(false, null);
        }
        if (i == 2) {
            return new PBUserProfileSurveyInputState.WorkLocationInputPBUserProfile(false, null);
        }
        if (i == 3) {
            TimingVariability timingVariability = TimingVariability.EXACT;
            return new PBUserProfileSurveyInputState.WorkTimingInputPBUserProfile(false, null, timingVariability, null, timingVariability);
        }
        if (i == 4) {
            return new PBUserProfileSurveyInputState.TravelFrequencyInputPBUserProfile(false, null);
        }
        throw new NoWhenBranchMatchedException();
    }
}

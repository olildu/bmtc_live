package app.chalo.domain;

import app.chalo.buildconfig.ChaloBuildConfig;
import app.chalo.buildconfig.ProductFlavor;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import defpackage.nf1;
import defpackage.r1;
import in.juspay.hypersdk.analytics.LogConstants;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/domain/IsNewCardExperienceEnabledUseCase;", "", "CardOptionsConfig", "CityCardOptions", "Companion", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IsNewCardExperienceEnabledUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChaloConfigFeature f2506a;
    public final CrashlyticsLogger b;
    public final ChaloBuildConfig c;
    public final BasicInfoContract d;
    public final CityProvider e;
    public CardOptionsConfig f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/domain/IsNewCardExperienceEnabledUseCase$CardOptionsConfig;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CardOptionsConfig {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] b = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a(0))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f2507a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/domain/IsNewCardExperienceEnabledUseCase$CardOptionsConfig$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/domain/IsNewCardExperienceEnabledUseCase$CardOptionsConfig;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CardOptionsConfig> serializer() {
                return IsNewCardExperienceEnabledUseCase$CardOptionsConfig$$serializer.f2508a;
            }
        }

        public CardOptionsConfig(int i, List list) {
            if ((i & 1) == 0) {
                this.f2507a = EmptyList.f17557a;
            } else {
                this.f2507a = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CardOptionsConfig) && Intrinsics.d(this.f2507a, ((CardOptionsConfig) obj).f2507a);
        }

        public final int hashCode() {
            return this.f2507a.hashCode();
        }

        public final String toString() {
            return r1.d("CardOptionsConfig(homescreenCardExpOptions=", ")", this.f2507a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0083\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/domain/IsNewCardExperienceEnabledUseCase$CityCardOptions;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CityCardOptions {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] c = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new a(1))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2509a;
        public final List b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/domain/IsNewCardExperienceEnabledUseCase$CityCardOptions$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/domain/IsNewCardExperienceEnabledUseCase$CityCardOptions;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CityCardOptions> serializer() {
                return IsNewCardExperienceEnabledUseCase$CityCardOptions$$serializer.f2510a;
            }
        }

        public CityCardOptions(int i, String str, List list) {
            this.f2509a = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.b = EmptyList.f17557a;
            } else {
                this.b = list;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CityCardOptions)) {
                return false;
            }
            CityCardOptions cityCardOptions = (CityCardOptions) obj;
            return Intrinsics.d(this.f2509a, cityCardOptions.f2509a) && Intrinsics.d(this.b, cityCardOptions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f2509a.hashCode() * 31);
        }

        public final String toString() {
            return nf1.m("CityCardOptions(city=", this.f2509a, ", chaloCardOptions=", ")", this.b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/domain/IsNewCardExperienceEnabledUseCase$Companion;", "", "", "DEFAULT_CITY_KEY", "Ljava/lang/String;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2511a;

        static {
            int[] iArr = new int[ProductFlavor.values().length];
            try {
                iArr[ProductFlavor.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductFlavor.BETA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductFlavor.ALPHA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2511a = iArr;
        }
    }

    public IsNewCardExperienceEnabledUseCase(ChaloBuildConfig chaloBuildConfig, BasicInfoContract basicInfoContract, CrashlyticsLogger crashlyticsLogger, ChaloConfigFeature chaloConfigFeature, CityProvider cityProvider) {
        this.f2506a = chaloConfigFeature;
        this.b = crashlyticsLogger;
        this.c = chaloBuildConfig;
        this.d = basicInfoContract;
        this.e = cityProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007b, code lost:
    
        if (r8 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
    
        if (r8 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof app.chalo.domain.IsNewCardExperienceEnabledUseCase$fetchConfig$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.domain.IsNewCardExperienceEnabledUseCase$fetchConfig$1 r0 = (app.chalo.domain.IsNewCardExperienceEnabledUseCase$fetchConfig$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.domain.IsNewCardExperienceEnabledUseCase$fetchConfig$1 r0 = new app.chalo.domain.IsNewCardExperienceEnabledUseCase$fetchConfig$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.ResultKt.b(r8)
            goto L7e
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            kotlin.ResultKt.b(r8)
            goto L8c
        L39:
            kotlin.ResultKt.b(r8)
            goto L55
        L3d:
            kotlin.ResultKt.b(r8)
            app.chalo.contract.BasicInfoContract r8 = r7.d
            boolean r8 = r8.f()
            app.chalo.features.chaloconfig.ChaloConfigFeature r2 = r7.f2506a
            if (r8 == 0) goto L58
            r0.label = r5
            java.lang.String r8 = "chaloCardExpOptionsDev"
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L55
            goto L8b
        L55:
            java.lang.String r8 = (java.lang.String) r8
            goto L8e
        L58:
            app.chalo.buildconfig.ChaloBuildConfig r8 = r7.c
            app.chalo.buildconfig.ProductFlavor r8 = r8.m()
            int[] r6 = app.chalo.domain.IsNewCardExperienceEnabledUseCase.WhenMappings.f2511a
            int r8 = r8.ordinal()
            r8 = r6[r8]
            if (r8 == r5) goto L81
            if (r8 == r4) goto L73
            if (r8 != r3) goto L6d
            goto L73
        L6d:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L73:
            r0.label = r3
            java.lang.String r8 = "chaloCardExpOptionsBeta"
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L7e
            goto L8b
        L7e:
            java.lang.String r8 = (java.lang.String) r8
            goto L8e
        L81:
            r0.label = r4
            java.lang.String r8 = "chaloCardExpOptionsProd"
            java.lang.Object r8 = r2.a(r8, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            java.lang.String r8 = (java.lang.String) r8
        L8e:
            r0 = 0
            if (r8 == 0) goto Laf
            int r1 = r8.length()
            if (r1 != 0) goto L98
            goto Laf
        L98:
            kotlinx.serialization.json.Json r1 = app.chalo.network.config.ChaloJson.b     // Catch: java.lang.Exception -> La9
            app.chalo.domain.IsNewCardExperienceEnabledUseCase$CardOptionsConfig$Companion r2 = app.chalo.domain.IsNewCardExperienceEnabledUseCase.CardOptionsConfig.INSTANCE     // Catch: java.lang.Exception -> La9
            kotlinx.serialization.KSerializer r2 = r2.serializer()     // Catch: java.lang.Exception -> La9
            kotlinx.serialization.DeserializationStrategy r2 = (kotlinx.serialization.DeserializationStrategy) r2     // Catch: java.lang.Exception -> La9
            java.lang.Object r8 = r1.b(r8, r2)     // Catch: java.lang.Exception -> La9
            app.chalo.domain.IsNewCardExperienceEnabledUseCase$CardOptionsConfig r8 = (app.chalo.domain.IsNewCardExperienceEnabledUseCase.CardOptionsConfig) r8     // Catch: java.lang.Exception -> La9
            return r8
        La9:
            r8 = move-exception
            app.chalo.crashlytics.CrashlyticsLogger r1 = r7.b
            r1.i(r8)
        Laf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.domain.IsNewCardExperienceEnabledUseCase.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0095  */
    /* JADX WARN: Code duplicated, block: B:41:0x009f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:58:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[LOOP:1: B:39:0x0099->B:62:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ContinuationImpl continuationImpl) {
        IsNewCardExperienceEnabledUseCase$invoke$1 isNewCardExperienceEnabledUseCase$invoke$1;
        String str;
        String lowerCase;
        CardOptionsConfig cardOptionsConfig;
        String str2;
        List list;
        Iterator it;
        Object obj;
        Object next;
        CityCardOptions cityCardOptions;
        List list2;
        if (continuationImpl instanceof IsNewCardExperienceEnabledUseCase$invoke$1) {
            isNewCardExperienceEnabledUseCase$invoke$1 = (IsNewCardExperienceEnabledUseCase$invoke$1) continuationImpl;
            int i = isNewCardExperienceEnabledUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                isNewCardExperienceEnabledUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                isNewCardExperienceEnabledUseCase$invoke$1 = new IsNewCardExperienceEnabledUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            isNewCardExperienceEnabledUseCase$invoke$1 = new IsNewCardExperienceEnabledUseCase$invoke$1(this, continuationImpl);
        }
        Object obj2 = isNewCardExperienceEnabledUseCase$invoke$1.result;
        Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = isNewCardExperienceEnabledUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            CityAppModel cityAppModel = (CityAppModel) this.e.b().getValue();
            if (cityAppModel == null || (str = cityAppModel.f8854a) == null) {
                return Boolean.FALSE;
            }
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.h(lowerCase, "toLowerCase(...)");
            cardOptionsConfig = this.f;
            if (cardOptionsConfig == null) {
                isNewCardExperienceEnabledUseCase$invoke$1.L$0 = lowerCase;
                isNewCardExperienceEnabledUseCase$invoke$1.label = 1;
                Object objA = a(isNewCardExperienceEnabledUseCase$invoke$1);
                if (objA == obj3) {
                    return obj3;
                }
                str2 = lowerCase;
                obj2 = objA;
            }
            List list3 = cardOptionsConfig.f2507a;
            this.f = cardOptionsConfig;
            list = list3;
            it = list.iterator();
            do {
                obj = null;
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.x(((CityCardOptions) next).f2509a, lowerCase, true));
            cityCardOptions = (CityCardOptions) next;
            if (cityCardOptions == null) {
                for (Object obj4 : list) {
                    if (StringsKt.x(((CityCardOptions) obj4).f2509a, LogConstants.DEFAULT_CHANNEL, true)) {
                        obj = obj4;
                        break;
                    }
                }
                cityCardOptions = (CityCardOptions) obj;
            }
            return Boolean.valueOf(cityCardOptions == null && (list2 = cityCardOptions.b) != null && (list2.isEmpty() ^ true));
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) isNewCardExperienceEnabledUseCase$invoke$1.L$0;
        ResultKt.b(obj2);
        cardOptionsConfig = (CardOptionsConfig) obj2;
        if (cardOptionsConfig == null) {
            return Boolean.FALSE;
        }
        lowerCase = str2;
        List list4 = cardOptionsConfig.f2507a;
        this.f = cardOptionsConfig;
        list = list4;
        it = list.iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!StringsKt.x(((CityCardOptions) next).f2509a, lowerCase, true));
        cityCardOptions = (CityCardOptions) next;
        if (cityCardOptions == null) {
            while (r8.hasNext()) {
                if (StringsKt.x(((CityCardOptions) obj4).f2509a, LogConstants.DEFAULT_CHANNEL, true)) {
                    obj = obj4;
                    break;
                }
            }
            cityCardOptions = (CityCardOptions) obj;
        }
        return Boolean.valueOf(cityCardOptions == null && (list2 = cityCardOptions.b) != null && (list2.isEmpty() ^ true));
    }
}

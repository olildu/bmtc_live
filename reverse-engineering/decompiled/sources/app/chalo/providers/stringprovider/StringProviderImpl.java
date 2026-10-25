package app.chalo.providers.stringprovider;

import androidx.compose.runtime.ProvidableCompositionLocal;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import org.jetbrains.compose.resources.DefaultAndroidResourceReader;
import org.jetbrains.compose.resources.ResourceEnvironment;
import org.jetbrains.compose.resources.ResourceEnvironmentKt;
import org.jetbrains.compose.resources.ResourceReaderKt;
import org.jetbrains.compose.resources.StringResource;
import org.jetbrains.compose.resources.StringResourcesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/providers/stringprovider/StringProviderImpl;", "Lapp/chalo/providers/stringprovider/StringProvider;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class StringProviderImpl implements StringProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlatformStringOverrideProvider f8868a;

    public StringProviderImpl(PlatformStringOverrideProvider platformStringOverrideProvider) {
        this.f8868a = platformStringOverrideProvider;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00de  */
    /* JADX WARN: Code duplicated, block: B:29:0x0101  */
    /* JADX WARN: Code duplicated, block: B:32:0x010a  */
    /* JADX WARN: Code duplicated, block: B:35:0x012a  */
    /* JADX WARN: Code duplicated, block: B:37:0x012e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x012a -> B:36:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x012e -> B:38:0x012f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // app.chalo.providers.stringprovider.StringProvider
    public final java.lang.Object a(app.chalo.providers.stringprovider.StringArrayEnum r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.providers.stringprovider.StringProviderImpl.a(app.chalo.providers.stringprovider.StringArrayEnum, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.providers.stringprovider.StringProvider
    public final Object b(StringEnum stringEnum, Object[] objArr, Continuation continuation) {
        StringProviderImpl$getString$1 stringProviderImpl$getString$1;
        StringResource stringResourceA;
        if (continuation instanceof StringProviderImpl$getString$1) {
            stringProviderImpl$getString$1 = (StringProviderImpl$getString$1) continuation;
            int i = stringProviderImpl$getString$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                stringProviderImpl$getString$1.label = i - Integer.MIN_VALUE;
            } else {
                stringProviderImpl$getString$1 = new StringProviderImpl$getString$1(this, continuation);
            }
        } else {
            stringProviderImpl$getString$1 = new StringProviderImpl$getString$1(this, continuation);
        }
        Object objA = stringProviderImpl$getString$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = stringProviderImpl$getString$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            stringResourceA = StringEnumHelperKt.a(stringEnum);
            String strConcat = "brand_override_".concat(stringResourceA.c);
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            stringProviderImpl$getString$1.L$0 = objArr;
            stringProviderImpl$getString$1.L$1 = stringResourceA;
            stringProviderImpl$getString$1.label = 1;
            objA = this.f8868a.a(strConcat, objArrCopyOf);
            if (objA != coroutineSingletons) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return objA;
        }
        stringResourceA = (StringResource) stringProviderImpl$getString$1.L$1;
        objArr = (Object[]) stringProviderImpl$getString$1.L$0;
        ResultKt.b(objA);
        String str = (String) objA;
        if (str != null) {
            return str;
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, objArr.length);
        stringProviderImpl$getString$1.L$0 = null;
        stringProviderImpl$getString$1.L$1 = null;
        stringProviderImpl$getString$1.label = 2;
        ArrayList arrayList = new ArrayList(objArrCopyOf2.length);
        for (Object obj : objArrCopyOf2) {
            arrayList.add(obj.toString());
        }
        ProvidableCompositionLocal providableCompositionLocal = ResourceReaderKt.f18785a;
        Object objA2 = StringResourcesKt.a(stringResourceA, arrayList, DefaultAndroidResourceReader.f18773a, (ResourceEnvironment) ((Function0) ResourceEnvironmentKt.c).invoke(), stringProviderImpl$getString$1);
        return objA2 == coroutineSingletons ? coroutineSingletons : objA2;
    }
}

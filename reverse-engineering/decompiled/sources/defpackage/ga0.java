package defpackage;

import androidx.compose.material3.SwipeToDismissBoxDefaults;
import androidx.compose.ui.text.font.FontVariation;
import androidx.compose.ui.text.font.PlatformFontVariationSettings_androidKt;
import androidx.compose.ui.unit.Density;
import java.io.ByteArrayInputStream;
import javax.xml.parsers.DocumentBuilderFactory;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.compose.resources.ImageCache;
import org.jetbrains.compose.resources.vector.XmlVectorParserKt;
import org.jetbrains.compose.resources.vector.xmldom.ElementImpl;
import org.w3c.dom.Element;
import org.xml.sax.InputSource;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class ga0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15713a;
    public final /* synthetic */ Density b;

    public /* synthetic */ ga0(Density density, int i) {
        this.f15713a = i;
        this.b = density;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f15713a) {
            case 0:
                Intrinsics.i((byte[]) obj, "<this>");
                throw new IllegalStateException("Android platform doesn't support SVG format.");
            case 1:
                byte[] bArr = (byte[]) obj;
                Intrinsics.i(bArr, "<this>");
                DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
                documentBuilderFactoryNewInstance.setNamespaceAware(true);
                Element documentElement = documentBuilderFactoryNewInstance.newDocumentBuilder().parse(new InputSource(new ByteArrayInputStream(bArr))).getDocumentElement();
                Intrinsics.h(documentElement, "getDocumentElement(...)");
                return new ImageCache.Vector(XmlVectorParserKt.f(new ElementImpl(documentElement), this.b));
            case 2:
                return PlatformFontVariationSettings_androidKt.toAndroidString$lambda$0(this.b, (FontVariation.Setting) obj);
            default:
                return Float.valueOf(SwipeToDismissBoxDefaults._get_positionalThreshold_$lambda$2$lambda$1$lambda$0(this.b, ((Float) obj).floatValue()));
        }
    }
}
